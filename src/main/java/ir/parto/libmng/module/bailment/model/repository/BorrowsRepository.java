package ir.parto.libmng.module.bailment.model.repository;

import ir.parto.libmng.module.bailment.model.entity.Borrows;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BorrowsRepository extends JpaRepository<Borrows, Long> {
}
