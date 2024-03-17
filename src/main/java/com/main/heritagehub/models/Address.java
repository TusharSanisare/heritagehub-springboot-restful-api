package com.main.heritagehub.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Address {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int address_id;

  private int user_id;
  private String house_no;
  private String street;
  private String colony;
  private String area;
  private String city;
  private String state;
  private String country;

  public Address(int user_id, String house_no, String street, String colony, String area, String city, String state,
      String country) {
    this.user_id = user_id;
    this.house_no = house_no;
    this.street = street;
    this.colony = colony;
    this.area = area;
    this.city = city;
    this.state = state;
    this.country = country;
  }

  public Address() {

  }

  @Override
  public String toString() {
    return "Address [address_id=" + address_id + ", user_id=" + user_id + ", house_no=" + house_no + ", street="
        + street + ", colony=" + colony + ", area=" + area + ", city=" + city + ", state=" + state + ", country="
        + country + "]";
  }

  public int getAddress_id() {
    return address_id;
  }

  public void setAddress_id(int address_id) {
    this.address_id = address_id;
  }

  public int getUser_id() {
    return user_id;
  }

  public void setUser_id(int user_id) {
    this.user_id = user_id;
  }

  public String getHouse_no() {
    return house_no;
  }

  public void setHouse_no(String house_no) {
    this.house_no = house_no;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public String getColony() {
    return colony;
  }

  public void setColony(String colony) {
    this.colony = colony;
  }

  public String getArea() {
    return area;
  }

  public void setArea(String area) {
    this.area = area;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

}
