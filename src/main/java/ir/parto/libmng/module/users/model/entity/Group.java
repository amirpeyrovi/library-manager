package ir.parto.libmng.module.users.model.entity;

import org.hibernate.annotations.MetaValue;

import javax.persistence.*;

@Entity
@Table(name = "libmng_users_group")
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @Column(name = "book_count")
    private Long bookCount;

    @Column(name = "bailment_days")
    private Long bailmentDays;

    private Long price;

    public Group() {
    }

    public Group(String name, Long bookCount, Long bailmentDays, Long price) {
        this.name = name;
        this.bookCount = bookCount;
        this.bailmentDays = bailmentDays;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public Group setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Group setName(String name) {
        this.name = name;
        return this;
    }

    public Long getBookCount() {
        return bookCount;
    }

    public Group setBookCount(Long bookCount) {
        this.bookCount = bookCount;
        return this;
    }

    public Long getBailmentDays() {
        return bailmentDays;
    }

    public Group setBailmentDays(Long bailmentDays) {
        this.bailmentDays = bailmentDays;
        return this;
    }

    public Long getPrice() {
        return price;
    }

    public Group setPrice(Long price) {
        this.price = price;
        return this;
    }
}
