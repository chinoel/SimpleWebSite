package org.chinoel.goormspring.repository;

import org.chinoel.goormspring.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
