package com.main.heritagehub.controlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.heritagehub.models.Product;
import com.main.heritagehub.services.ProductImageService;
import com.main.heritagehub.services.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

  @Autowired
  private ProductService productService;
  @Autowired
  private ProductImageService productImageService;

  @PostMapping("/save")
  public String saveProduct(@RequestBody Product product) {
    productImageService.save(product.getProductImage());
    Product temp = productService.save(product);
    return temp.toString();
  }
}
