package com.main.heritagehub.controlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.heritagehub.models.Seller;
import com.main.heritagehub.services.AddressService;
import com.main.heritagehub.services.SellerService;

@RestController
@RequestMapping("/seller")
public class SellerController {

  @Autowired
  private SellerService sellerService;
  @Autowired
  private AddressService addresssService;

  @PostMapping("/save")
  public String save(@RequestBody Seller seller) {
    addresssService.save(seller.getAddress());
    Seller temp = sellerService.save(seller);
    return temp.toString();
  }
}
