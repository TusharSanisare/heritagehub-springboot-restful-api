package com.main.heritagehub.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.main.heritagehub.models.Product;
import com.main.heritagehub.repositories.ProductRepo;

@Component
public class ProductService {

  @Autowired
  private ProductRepo productRepo;

  public Product save(Product product) {

    if (product != null) {
      Product temp = productRepo.save(product);
      return temp;
    } else {
      return null;
    }

  }

}
