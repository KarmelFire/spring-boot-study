package top.karmel.springboot.file.utils;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import top.karmel.springboot.file.config.OssConfig;

import java.io.IOException;
import java.io.InputStream;

@Component
@Slf4j
public class OssTemplate {

    @Resource
    private OssConfig ossConfig;

    private OSS createOSSClient() {
        return new OSSClientBuilder().build(ossConfig.getEndpoint(), ossConfig.getAk(), ossConfig.getSecret());
    }

    public String ossUpload(MultipartFile file) {
        String url = null;
        String fileName = file.getOriginalFilename();
        assert fileName != null;

        // 创建 OSS 客户端
        OSS ossClient = createOSSClient();
        try {
            // 上传文件
            InputStream inputStream = file.getInputStream();
            String objectName = ossConfig.getDir() + fileName; // 你可以根据需要修改文件路径
            ossClient.putObject(ossConfig.getBucket(), objectName, inputStream);

            // 构造文件访问 URL
            url = ossConfig.getHost() + "/" + objectName;
            log.info("文件上传成功，URL: {}", url);
        } catch (IOException e) {
            log.error("文件上传失败", e);
            throw new RuntimeException("文件上传失败", e);
        } finally {
            // 确保 OSS 客户端在操作完成后关闭
            if (ossClient != null) {
                ossClient.shutdown();
            }
        }

        return url;
    }
}
