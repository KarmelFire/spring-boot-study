package top.karmel.springboot.quickstart.service;

import org.springframework.stereotype.Service;
import top.karmel.springboot.quickstart.enums.RequestType;

/**
 * @ClassName CustomerService
 * @Description TODO
 * @Author BC
 * @Date 2024/9/2 16:14
 * @Version 1.0
 */
@Service
public class CustomerService {
    public String handleRequest(RequestType requestType) {
        return switch (requestType) {
            case QUERY -> handleQuery();
            case COMPLAINT -> handleComplaint();
            case SUGGESTION -> handleSuggestion();
        };
    }

    public String handleQuery() {
        return "查询请求";
    }

    public String handleComplaint() {
        return "投诉请求";
    }

    public String handleSuggestion() {
        return "建议请求";
    }

}
