package ir.parto.libmng.module.books.model.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "libmng_books")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String author;

    private String publisher;

    @Column(name = "published_year")
    private Long publishedYear;

    private Long count;

    private Long price;

    @OneToMany(mappedBy = "books")
    private List<Comments> commentsList;

    @ManyToMany
    @JoinTable(name = "libmng_books_book_category")
    private List<Category> categoryList;

    public Books() {
    }

    public Books(String name, String author, String publisher, Long publishedYear, Long count, Long price, List<Comments> commentsList, List<Category> categoryList) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.publishedYear = publishedYear;
        this.count = count;
        this.price = price;
        this.commentsList = commentsList;
        this.categoryList = categoryList;
    }

    public Long getId() {
        return id;
    }

    public Books setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Books setName(String name) {
        this.name = name;
        return this;
    }

    public String getAuthor() {
        return author;
    }

    public Books setAuthor(String author) {
        this.author = author;
        return this;
    }

    public String getPublisher() {
        return publisher;
    }

    public Books setPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    public Long getPublishedYear() {
        return publishedYear;
    }

    public Books setPublishedYear(Long publishedYear) {
        this.publishedYear = publishedYear;
        return this;
    }

    public Long getCount() {
        return count;
    }

    public Books setCount(Long count) {
        this.count = count;
        return this;
    }

    public Long getPrice() {
        return price;
    }

    public Books setPrice(Long price) {
        this.price = price;
        return this;
    }

    public List<Comments> getCommentsList() {
        return commentsList;
    }

    public Books setCommentsList(List<Comments> commentsList) {
        this.commentsList = commentsList;
        return this;
    }

    public List<Category> getCategoryList() {
        return categoryList;
    }

    public Books setCategoryList(List<Category> categoryList) {
        this.categoryList = categoryList;
        return this;
    }
}
