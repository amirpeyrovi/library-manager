package ir.parto.libmng.module.books.model.repository;

import ir.parto.libmng.module.books.model.entity.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksRepository extends JpaRepository<Books, Long> {
}
