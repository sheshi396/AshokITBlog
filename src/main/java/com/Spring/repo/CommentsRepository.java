package com.Spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Spring.entity.Comments;

public interface CommentsRepository extends JpaRepository<Comments, Integer> {

}
