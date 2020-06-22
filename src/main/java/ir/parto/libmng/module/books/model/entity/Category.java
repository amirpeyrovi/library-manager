package ir.parto.libmng.module.books.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "libmng_book_category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;

    public Category() {
    }

    public Category(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public Category setId(Long id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Category setTitle(String title) {
        this.title = title;
        return this;
    }
}
