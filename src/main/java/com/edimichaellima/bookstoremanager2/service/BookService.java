package com.edimichaellima.bookstoremanager2.service;

import com.edimichaellima.bookstoremanager2.dto.MessageResponseDTO;
import com.edimichaellima.bookstoremanager2.entity.Book;
import com.edimichaellima.bookstoremanager2.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public MessageResponseDTO create(Book book) {
        Book savedBook = bookRepository.save(book);
        return MessageResponseDTO.builder()
                .message("Book Created with ID " + savedBook.getId())
                .build();
    }
}
