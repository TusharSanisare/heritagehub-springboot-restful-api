package com.main.heritagehub.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.heritagehub.models.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

}
