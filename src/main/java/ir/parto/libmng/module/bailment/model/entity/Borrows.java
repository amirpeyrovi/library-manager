package ir.parto.libmng.module.bailment.model.entity;

import ir.parto.libmng.module.admins.model.entity.Admins;
import ir.parto.libmng.module.books.model.entity.Books;
import ir.parto.libmng.module.users.model.entity.Users;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "libmng_borrow")
public class Borrows {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Books books;

    @ManyToOne
    private Users users;

    @ManyToOne
    private Admins admins;

    @Column(name = "start_date")
    private LocalDateTime startDate;

    @Column(name = "end_date")
    private LocalDateTime endDate;

    public Borrows() {
    }

    public Borrows(Books books, Users users, Admins admins, LocalDateTime startDate, LocalDateTime endDate) {
        this.books = books;
        this.users = users;
        this.admins = admins;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Long getId() {
        return id;
    }

    public Borrows setId(Long id) {
        this.id = id;
        return this;
    }

    public Books getBooks() {
        return books;
    }

    public Borrows setBooks(Books books) {
        this.books = books;
        return this;
    }

    public Users getUsers() {
        return users;
    }

    public Borrows setUsers(Users users) {
        this.users = users;
        return this;
    }

    public Admins getAdmins() {
        return admins;
    }

    public Borrows setAdmins(Admins admins) {
        this.admins = admins;
        return this;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public Borrows setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
        return this;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public Borrows setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
        return this;
    }
}
