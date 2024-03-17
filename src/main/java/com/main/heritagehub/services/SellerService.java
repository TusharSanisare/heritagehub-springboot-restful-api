package com.main.heritagehub.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.main.heritagehub.models.Seller;
import com.main.heritagehub.repositories.SellerRepo;

@Component
public class SellerService {
  @Autowired
  private SellerRepo sellerRepo;

  public Seller save(Seller seller) {
    if (seller != null) {
      Seller temp = sellerRepo.save(seller);
      return temp;
    } else {
      return null;
    }
  }
}
