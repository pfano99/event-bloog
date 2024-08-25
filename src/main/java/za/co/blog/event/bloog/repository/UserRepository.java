package za.co.blog.event.bloog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.blog.event.bloog.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
