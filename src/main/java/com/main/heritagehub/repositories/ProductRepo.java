package com.main.heritagehub.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.heritagehub.models.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}
