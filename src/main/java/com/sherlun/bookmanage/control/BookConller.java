package com.sherlun.bookmanage.control;

import com.sherlun.bookmanage.entity.Book;
import com.sherlun.bookmanage.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("book")
public class BookConller {
    @Autowired
    BookService bookService;

    @RequestMapping("/findAll")
    List<Book> findAll(Model model) {
        List<Book> result = bookService.findAll();
        return result;
    }

}
