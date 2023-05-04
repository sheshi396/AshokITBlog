package com.Spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Spring.entity.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {

}
