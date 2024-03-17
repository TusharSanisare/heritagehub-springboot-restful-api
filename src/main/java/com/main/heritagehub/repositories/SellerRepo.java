package com.main.heritagehub.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.heritagehub.models.Seller;

@Repository
public interface SellerRepo extends JpaRepository<Seller, Integer> {

}
