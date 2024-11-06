package top.karmel.springboot.task.jobs;

import com.alibaba.excel.EasyExcel;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;
import top.karmel.springboot.task.entity.Student;
import top.karmel.springboot.task.mapper.StudentMapper;

import java.util.List;
import java.util.UUID;

/**
 * @ClassName ExportJob
 * @Description TODO
 * @Author BC
 * @Date 2024/10/28 16:25
 * @Version 1.0
 */
@Slf4j
@AllArgsConstructor
public class ExportJob extends QuartzJobBean {
    protected final StudentMapper studentMapper;
    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        log.info("开始执行导出任务");
        List<Student> students = studentMapper.selectList(null);
        String fileName = "C:\\Users\\BC\\Desktop\\新建文件夹\\" + UUID.randomUUID() + ".xlsx";
        EasyExcel.write(fileName, Student.class)
                .sheet("学生数据")
                .doWrite(() -> students);
    }
}
