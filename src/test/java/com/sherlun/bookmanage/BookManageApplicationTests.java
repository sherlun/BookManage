package com.sherlun.bookmanage;

import com.sherlun.bookmanage.entity.Book;
import com.sherlun.bookmanage.mapper.BookMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class BookManageApplicationTests {

    @Test
    void contextLoads() {
    }
    @Autowired
    BookMapper bookMapper;
    @Test
    void test() {
        List<Book> all = bookMapper.findAll();
        System.out.println(all);
    }
}
