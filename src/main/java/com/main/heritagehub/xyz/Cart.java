// package com.main.heritagehub.xyz;

// import java.util.List;

// import com.main.heritagehub.models.Product;

// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import jakarta.persistence.OneToMany;

// @Entity
// public class Cart {

// @Id
// @GeneratedValue(strategy = GenerationType.AUTO)
// private int cart_id;

// private int user_id;

// @OneToMany
// private List<Product> product_list;

// public Cart(int user_id, List<Product> product_list) {
// this.user_id = user_id;
// this.product_list = product_list;
// }

// public Cart() {
// }

// @Override
// public String toString() {
// return "Cart [cart_id=" + cart_id + ", user_id=" + user_id + ",
// product_list=" + product_list + "]";
// }

// public int getCart_id() {
// return cart_id;
// }

// public void setCart_id(int cart_id) {
// this.cart_id = cart_id;
// }

// public int getUser_id() {
// return user_id;
// }

// public void setUser_id(int user_id) {
// this.user_id = user_id;
// }

// public List<Product> getProduct_list() {
// return product_list;
// }

// public void setProduct_list(List<Product> product_list) {
// this.product_list = product_list;
// }

// }
