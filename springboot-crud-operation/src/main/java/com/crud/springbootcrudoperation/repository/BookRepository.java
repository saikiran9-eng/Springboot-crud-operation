package com.crud.springbootcrudoperation.repository;

import com.crud.springbootcrudoperation.entity.Books;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Books, Integer> {
}
