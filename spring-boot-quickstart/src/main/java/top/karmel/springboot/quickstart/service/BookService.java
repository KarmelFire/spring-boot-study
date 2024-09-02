package top.karmel.springboot.quickstart.service;

import org.springframework.stereotype.Service;
import top.karmel.springboot.quickstart.dto.BookDTO;

import java.util.List;

/**
 * @ClassName BookService
 * @Description TODO
 * @Author BC
 * @Date 2024/9/2 16:01
 * @Version 1.0
 */
@Service
public class BookService {
    public List<BookDTO> getAllBooks() {
        return List.of(
                new BookDTO(1L, "Java Programming", "Alice", 29.99),
                new BookDTO(2L, "Java Programming", "Alice", 39.99)
        );
    }
}
