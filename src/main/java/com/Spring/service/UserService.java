package com.Spring.service;

import com.Spring.binding.User;
import com.Spring.entity.BlogUser;

public interface UserService {
	BlogUser register(User user);
    boolean login(String email, String password);

}
