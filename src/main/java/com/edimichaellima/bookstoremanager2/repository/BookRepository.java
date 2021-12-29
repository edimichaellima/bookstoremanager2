package com.edimichaellima.bookstoremanager2.repository;

import com.edimichaellima.bookstoremanager2.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
