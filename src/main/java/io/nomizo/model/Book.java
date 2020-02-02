package io.nomizo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Lombok creates Getters & Setters with @Data annotation,
 * creates a constructor with all the args with @AllArgsConstructor,
 * creates a NoArgsConstructor with @NoArgsConstructor, and a
 * ToString method with @ToString
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Book {
    private int bookId;
    private String bookName;
    private String author;
}
