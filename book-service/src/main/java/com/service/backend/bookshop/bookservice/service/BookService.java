package com.service.backend.bookshop.bookservice.service;


import com.service.backend.bookshop.bookservice.dto.BookDto;

import java.util.List;
import java.util.UUID;

public interface BookService {
    BookDto createBook(BookDto bookDto);
    BookDto updateBook(UUID bookId, BookDto bookDto);
    List<BookDto> findAllBooks();
    BookDto findBookById(UUID bookId);
    void deleteBook(UUID bookId);
}
