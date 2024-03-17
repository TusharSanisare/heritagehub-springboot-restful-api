package com.main.heritagehub.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int user_id;

  private String user_gender;
  private String user_name;
  private String user_email;
  private String user_phone;

  @OneToMany
  private List<Product> cart;

  @OneToOne
  private Address address;

  @OneToMany
  private List<Product> cart_history;

  @Override
  public String toString() {
    return "User [user_id=" + user_id + ", user_gender=" + user_gender + ", user_name=" + user_name + ", user_email="
        + user_email + ", user_phone=" + user_phone + ", cart=" + cart + ", address=" + address + ", cart_history="
        + cart_history + "]";
  }

  public User() {

  }

  public User(String user_gender, String user_name, String user_email, String user_phone, List<Product> cart,
      Address address, List<Product> cart_history) {
    this.user_gender = user_gender;
    this.user_name = user_name;
    this.user_email = user_email;
    this.user_phone = user_phone;
    this.cart = cart;
    this.address = address;
    this.cart_history = cart_history;
  }

  public int getUser_id() {
    return user_id;
  }

  public void setUser_id(int user_id) {
    this.user_id = user_id;
  }

  public String getUser_gender() {
    return user_gender;
  }

  public void setUser_gender(String user_gender) {
    this.user_gender = user_gender;
  }

  public String getUser_name() {
    return user_name;
  }

  public void setUser_name(String user_name) {
    this.user_name = user_name;
  }

  public String getUser_email() {
    return user_email;
  }

  public void setUser_email(String user_email) {
    this.user_email = user_email;
  }

  public String getUser_phone() {
    return user_phone;
  }

  public void setUser_phone(String user_phone) {
    this.user_phone = user_phone;
  }

  public List<Product> getCart() {
    return cart;
  }

  public void setCart(List<Product> cart) {
    this.cart = cart;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public List<Product> getCart_history() {
    return cart_history;
  }

  public void setCart_history(List<Product> cart_history) {
    this.cart_history = cart_history;
  }

}
