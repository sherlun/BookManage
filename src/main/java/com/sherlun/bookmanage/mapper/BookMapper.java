package com.sherlun.bookmanage.mapper;

import com.sherlun.bookmanage.entity.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookMapper {
    /**
     * 查询所有书籍信息
     * @return Book
     */
//    @Select("select * from book")
    List<Book> findAll();
}
