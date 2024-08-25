package za.co.blog.event.bloog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.blog.event.bloog.model.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
}
