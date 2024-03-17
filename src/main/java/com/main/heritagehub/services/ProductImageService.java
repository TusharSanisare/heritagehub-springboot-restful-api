package com.main.heritagehub.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.main.heritagehub.models.ProductImage;
import com.main.heritagehub.repositories.ProductImageRepo;

@Component
public class ProductImageService {

  @Autowired
  private ProductImageRepo productImageRepo;

  public ProductImage save(ProductImage productImage) {

    if (productImage != null) {
      ProductImage temp = productImageRepo.save(productImage);
      return temp;
    } else {
      return null;
    }
  }
}
