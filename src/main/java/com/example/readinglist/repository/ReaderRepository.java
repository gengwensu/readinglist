package com.example.readinglist.repository;

import com.example.readinglist.domain.Reader;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 */
public interface ReaderRepository extends JpaRepository<Reader, String> {
}
