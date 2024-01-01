package com.service.backend.bookshop.common.entity.book;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
import java.util.UUID;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID bookId;
    @Column(nullable = false, unique = true)
    private String title;
    @Column(nullable = false)
    private String author;
    private String publisher;
    @Column(name = "small_description")
    private String smallDescription;
    @Column(name = "long_description", nullable = false)
    private String LongDescription;
    @Column(nullable = false)
    private String ISBN;
    @Column(nullable = false)
    private Date year;
    @CreationTimestamp
    private Date createdAt;
    @UpdateTimestamp
    private Date updatedAt;
    private String images;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

}
