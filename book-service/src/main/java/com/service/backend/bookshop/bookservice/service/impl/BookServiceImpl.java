package com.service.backend.bookshop.bookservice.service.impl;

import com.service.backend.bookshop.bookservice.repository.BookRepository;
import com.service.backend.bookshop.bookservice.service.BookService;
import com.service.backend.bookshop.bookservice.dto.BookDto;
import com.service.backend.bookshop.common.entity.book.Book;
import com.service.backend.bookshop.common.exception.BookShopSystemException;
import com.service.backend.bookshop.common.exception.ResourceNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.UUID;


@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;

    @Override
    public BookDto createBook(BookDto bookDto) {
        if (bookDto.getTitle() != null) {
            throw new BookShopSystemException("before title is save", HttpStatus.BAD_REQUEST, "error");
        } else {
//            Book saveBook = Mapp
//            bookRepository.save(saveBook);
//
//            return mapper.map(saveBook, BookDto.class);
        }
        return null;
    }

    @Override
    public BookDto updateBook(UUID bookId, BookDto bookDto) {
        Book book = bookRepository.findById(bookId).orElseThrow(
                () -> new ResourceNotFoundException("book ", "id ", bookId)
        );
        book.setTitle(bookDto.getTitle());
        book.setSmallDescription(bookDto.getSmallDescription());
        book.setLongDescription(bookDto.getLongDescription());
        book.setAuthor(bookDto.getAuthor());
        book.setImages(bookDto.getImages());
        book.setISBN(bookDto.getISBN());
        book.setYear(bookDto.getYear());

        return null;
    }

    @Override
    public List<BookDto> findAllBooks() {
        List<Book> bookList = bookRepository.findAll();
//        return bookList.stream().map(book -> mapper.map(book, BookDto.class)).collect(Collectors.toList());
        return null;
    }

    @Override
    public BookDto findBookById(UUID bookId) {
        Book book = bookRepository.findById(bookId).orElseThrow(
                () -> new ResourceNotFoundException("Book", "id", bookId)
        );
//        return mapper.map(book, BookDto.class);
        return null;
    }

    @Override
    public void deleteBook(UUID bookId) {
        Book book = bookRepository.findById(bookId).orElseThrow(
                () -> new ResourceNotFoundException("Book", "id", bookId)
        );
        bookRepository.delete(book);
    }
}
