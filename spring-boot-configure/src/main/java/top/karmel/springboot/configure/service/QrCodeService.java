package top.karmel.springboot.configure.service;

import cn.hutool.extra.qrcode.QrCodeUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;

/**
 * @ClassName QrCodeService
 * @Description TODO
 * @Author BC
 * @Date 2024/9/25 15:49
 * @Version 1.0
 */
@Slf4j
@Service
public class QrCodeService {
    @Value("${custom.qrcode.content}")
    private String qrCodeContent;

    public void generateQrCode() {
        QrCodeUtil.generate(qrCodeContent,300,300,new File("qrcode.png"));
        log.info("二维码生成成功!");
    }
}
