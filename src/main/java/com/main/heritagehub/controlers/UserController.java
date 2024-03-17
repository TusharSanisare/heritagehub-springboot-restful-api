package com.main.heritagehub.controlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.heritagehub.models.User;
import com.main.heritagehub.services.AddressService;
import com.main.heritagehub.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

  @Autowired
  private UserService userService;
  @Autowired
  private AddressService addresssService;

  @PostMapping("/save")
  public String save(@RequestBody User user) {
    addresssService.save(user.getAddress());
    User temp = userService.save(user);
    return temp.toString();
  }
}
