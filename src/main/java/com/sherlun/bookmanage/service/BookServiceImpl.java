package com.sherlun.bookmanage.service;

import com.sherlun.bookmanage.mapper.BookMapper;
import com.sherlun.bookmanage.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookMapper bookMapper;

    @Override
    @Transactional
    public List<Book> findAll() {
        return bookMapper.findAll();
    }
}
