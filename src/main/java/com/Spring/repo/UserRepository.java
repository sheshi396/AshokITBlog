package com.Spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Spring.binding.User;
import com.Spring.entity.BlogUser;

public interface UserRepository extends JpaRepository<BlogUser, Integer>{

	BlogUser findByEmail(String email);

	BlogUser save(User user);

}
