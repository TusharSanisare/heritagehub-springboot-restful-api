package com.main.heritagehub.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Seller {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int seller_id;

  private String seller_gender;
  private String seller_name;
  private String seller_email;
  private String seller_phone;

  @OneToMany
  private List<Product> produst_list;

  @OneToOne
  private Address address;

  @OneToMany
  private List<Product> history;

  @Override
  public String toString() {
    return "Seller [seller_id=" + seller_id + ", seller_gender=" + seller_gender + ", seller_name=" + seller_name
        + ", seller_email=" + seller_email + ", seller_phone=" + seller_phone + ", produst_list=" + produst_list
        + ", address=" + address + ", history=" + history + "]";
  }

  public Seller() {

  }

  public Seller(String seller_gender, String seller_name, String seller_email, String seller_phone,
      List<Product> produst_list, Address address, List<Product> history) {
    this.seller_gender = seller_gender;
    this.seller_name = seller_name;
    this.seller_email = seller_email;
    this.seller_phone = seller_phone;
    this.produst_list = produst_list;
    this.address = address;
    this.history = history;
  }

  public int getSeller_id() {
    return seller_id;
  }

  public void setSeller_id(int seller_id) {
    this.seller_id = seller_id;
  }

  public String getSeller_gender() {
    return seller_gender;
  }

  public void setSeller_gender(String seller_gender) {
    this.seller_gender = seller_gender;
  }

  public String getSeller_name() {
    return seller_name;
  }

  public void setSeller_name(String seller_name) {
    this.seller_name = seller_name;
  }

  public String getSeller_email() {
    return seller_email;
  }

  public void setSeller_email(String seller_email) {
    this.seller_email = seller_email;
  }

  public String getSeller_phone() {
    return seller_phone;
  }

  public void setSeller_phone(String seller_phone) {
    this.seller_phone = seller_phone;
  }

  public List<Product> getProdust_list() {
    return produst_list;
  }

  public void setProdust_list(List<Product> produst_list) {
    this.produst_list = produst_list;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public List<Product> getHistory() {
    return history;
  }

  public void setHistory(List<Product> history) {
    this.history = history;
  }

}
