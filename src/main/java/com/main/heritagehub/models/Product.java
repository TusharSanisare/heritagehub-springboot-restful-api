package com.main.heritagehub.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Product {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int product_id;

  private String product_name;
  private String product_price;
  private String product_seller;
  private String product_discription;
  private String product_rating;

  @OneToOne
  private ProductImage productImage;

  public Product(int product_id, String product_name, String product_price, String product_seller,
      String product_discription, String product_rating, ProductImage productImage) {
    this.product_id = product_id;
    this.product_name = product_name;
    this.product_price = product_price;
    this.product_seller = product_seller;
    this.product_discription = product_discription;
    this.product_rating = product_rating;
    this.productImage = productImage;
  }

  public Product() {
    // super
  }

  @Override
  public String toString() {
    return "Product [product_id=" + product_id + ", product_name=" + product_name + ", product_price=" + product_price
        + ", product_seller=" + product_seller + ", product_discription=" + product_discription + ", product_rating="
        + product_rating + ", productImage=" + productImage.toString() + "]";
  }

  public int getProduct_id() {
    return product_id;
  }

  public void setProduct_id(int product_id) {
    this.product_id = product_id;
  }

  public String getProduct_name() {
    return product_name;
  }

  public void setProduct_name(String product_name) {
    this.product_name = product_name;
  }

  public String getProduct_price() {
    return product_price;
  }

  public void setProduct_price(String product_price) {
    this.product_price = product_price;
  }

  public String getProduct_seller() {
    return product_seller;
  }

  public void setProduct_seller(String product_seller) {
    this.product_seller = product_seller;
  }

  public String getProduct_discription() {
    return product_discription;
  }

  public void setProduct_discription(String product_discription) {
    this.product_discription = product_discription;
  }

  public String getProduct_rating() {
    return product_rating;
  }

  public void setProduct_rating(String product_rating) {
    this.product_rating = product_rating;
  }

  public ProductImage getProductImage() {
    return productImage;
  }

  public void setProductImage(ProductImage productImage) {
    this.productImage = productImage;
  }

}
