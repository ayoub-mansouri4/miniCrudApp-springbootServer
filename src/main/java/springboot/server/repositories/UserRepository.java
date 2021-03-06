package springboot.server.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springboot.server.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
