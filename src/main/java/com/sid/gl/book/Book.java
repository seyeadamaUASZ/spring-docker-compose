package com.sid.gl.book;

import io.r2dbc.spi.Row;
import io.r2dbc.spi.RowMetadata;

public record Book(Long id, String title, String isbn) {
    public static Book fromRow(Row row, RowMetadata metadata) {
        return new Book(
                row.get("id", Long.class),
                row.get("title", String.class),
                row.get("isbn", String.class)
        );
    }
}
