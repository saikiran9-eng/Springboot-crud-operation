package com.crud.springbootcrudoperation.entity;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Books")
public class Books {

    @Id
    @GeneratedValue
    private Integer bookid;

    @Column
    private String bookname;

    @Column
    private String bookauthor;

    @Column
    private Integer price;


}
