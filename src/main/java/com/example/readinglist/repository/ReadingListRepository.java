package com.example.readinglist.repository;

import com.example.readinglist.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 *
 */
public interface ReadingListRepository extends CrudRepository<Book, Long> {
    List<Book> findByReader(String reader);
}
