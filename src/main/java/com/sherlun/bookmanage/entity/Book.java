package com.sherlun.bookmanage.entity;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Book {
    private Long id;
    private String name;
    private String author;
}
