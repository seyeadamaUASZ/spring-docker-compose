package com.sid.gl.book;

import org.springframework.data.r2dbc.repository.R2dbcRepository;

public interface BookRepository extends R2dbcRepository<Book,Long> {
}
