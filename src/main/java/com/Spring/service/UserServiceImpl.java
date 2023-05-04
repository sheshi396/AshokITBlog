package com.Spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.binding.User;
import com.Spring.entity.BlogUser;
import com.Spring.repo.UserRepository;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepo;


    @Override
    public BlogUser register(User user) {
        return userRepo.save(user);
    }

    @Override
    public boolean login(String email, String password) {
        BlogUser user = userRepo.findByEmail(email);
        if (user != null && user.getPassword().equals(password)) {
            return true;
        }
        return false;
    }

}
