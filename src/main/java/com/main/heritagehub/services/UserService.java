package com.main.heritagehub.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.main.heritagehub.models.User;
import com.main.heritagehub.repositories.UserRepo;

@Component
public class UserService {

  @Autowired
  private UserRepo userRepo;

  public User save(User user) {
    if (user != null) {
      User temp = userRepo.save(user);
      return temp;
    } else {
      return null;
    }
  }
}
