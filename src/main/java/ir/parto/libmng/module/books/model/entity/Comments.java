package ir.parto.libmng.module.books.model.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import ir.parto.libmng.module.admins.model.entity.Admins;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "libmng_book_comment")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Comments {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Books books;

    @ManyToOne
    private Admins admins;

    private String comment;

    @Column(name = "create_date")
    private LocalDateTime createDate;

    public Long getId() {
        return id;
    }

    public Comments() {
    }

    public Comments(Books books, Admins admins, String comment, LocalDateTime createDate) {
        this.books = books;
        this.admins = admins;
        this.comment = comment;
        this.createDate = createDate;
    }

    public Comments setId(Long id) {
        this.id = id;
        return this;
    }

    public Books getBooks() {
        return books;
    }

    public Comments setBooks(Books books) {
        this.books = books;
        return this;
    }

    public Admins getAdmins() {
        return admins;
    }

    public Comments setAdmins(Admins admins) {
        this.admins = admins;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public Comments setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public Comments setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
        return this;
    }
}
