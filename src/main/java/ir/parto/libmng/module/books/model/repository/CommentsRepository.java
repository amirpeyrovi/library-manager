package ir.parto.libmng.module.books.model.repository;

import ir.parto.libmng.module.books.model.entity.Comments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentsRepository extends JpaRepository<Comments, Long> {
}
