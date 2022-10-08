package com.sherlun.bookmanage.service;

import com.sherlun.bookmanage.entity.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {
    List<Book> findAll();
}
