package ir.parto.libmng.module.users.model.repository;

import ir.parto.libmng.module.users.model.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {
}
