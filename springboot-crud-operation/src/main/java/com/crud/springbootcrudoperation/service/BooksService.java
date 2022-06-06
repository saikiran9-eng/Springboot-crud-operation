package com.crud.springbootcrudoperation.service;

import com.crud.springbootcrudoperation.entity.Books;
import com.crud.springbootcrudoperation.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BooksService {

    @Autowired
    BookRepository bookRepository;




   public  List<Books> getAllBooks()
   {
       List<Books> books = new ArrayList<Books>();
       bookRepository.findAll().forEach(books1 -> books.add(books1));
       return books;
   }

    public Books getBooksById(int id)
    {
        return bookRepository.findById(id).get();
    }
    public void saveOrUpdate(Books books)
    {
        bookRepository.save(books);
    }
    public void delete(int id)
    {
        bookRepository.deleteById(id);
    }

    public void update(Books books, int bookid)
    {
        bookRepository.save(books);
    }
}