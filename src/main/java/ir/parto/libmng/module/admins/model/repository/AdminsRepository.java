package ir.parto.libmng.module.admins.model.repository;

import ir.parto.libmng.module.admins.model.entity.Admins;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminsRepository extends JpaRepository<Admins, Long> {
}
