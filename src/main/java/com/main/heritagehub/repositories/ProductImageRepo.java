package com.main.heritagehub.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.heritagehub.models.ProductImage;

@Repository
public interface ProductImageRepo extends JpaRepository<ProductImage, Integer> {

}
