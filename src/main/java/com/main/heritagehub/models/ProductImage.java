package com.main.heritagehub.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ProductImage {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int product_Image_id;

  private String image_1;
  private String image_2;
  private String image_3;
  private String image_4;
  private String image_5;

  public ProductImage(String image_1, String image_2, String image_3, String image_4, String image_5) {
    this.image_1 = image_1;
    this.image_2 = image_2;
    this.image_3 = image_3;
    this.image_4 = image_4;
    this.image_5 = image_5;
  }

  public ProductImage() {
    // super
  }

  @Override
  public String toString() {
    return "ProductImage [product_Image_id=" + product_Image_id + ", image_1=" + image_1 + ", image_2=" + image_2
        + ", image_3=" + image_3 + ", image_4=" + image_4 + ", image_5=" + image_5 + "]";
  }

  public int getProduct_Image_id() {
    return product_Image_id;
  }

  public void setProduct_Image_id(int product_Image_id) {
    this.product_Image_id = product_Image_id;
  }

  public String getImage_1() {
    return image_1;
  }

  public void setImage_1(String image_1) {
    this.image_1 = image_1;
  }

  public String getImage_2() {
    return image_2;
  }

  public void setImage_2(String image_2) {
    this.image_2 = image_2;
  }

  public String getImage_3() {
    return image_3;
  }

  public void setImage_3(String image_3) {
    this.image_3 = image_3;
  }

  public String getImage_4() {
    return image_4;
  }

  public void setImage_4(String image_4) {
    this.image_4 = image_4;
  }

  public String getImage_5() {
    return image_5;
  }

  public void setImage_5(String image_5) {
    this.image_5 = image_5;
  }

}
