package top.karmel.springboot.quickstart.controller;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.karmel.springboot.quickstart.dto.BookDTO;
import top.karmel.springboot.quickstart.service.BookService;

import java.util.List;

/**
 * @ClassName BookController
 * @Description TODO
 * @Author BC
 * @Date 2024/9/2 16:04
 * @Version 1.0
 */
@RestController
@RequestMapping("/books")
public class BookController {
    @Resource
    private BookService bookService;

    @GetMapping()
    public List<BookDTO> getBooks() {
        return bookService.getAllBooks();
    }
}
