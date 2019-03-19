package com.example.readinglist.repository;

import com.example.readinglist.domain.Reader;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 *
 */
public interface ReaderRepository extends CrudRepository<Reader, String> {
}
