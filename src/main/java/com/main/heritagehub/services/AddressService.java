package com.main.heritagehub.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.main.heritagehub.models.Address;
import com.main.heritagehub.repositories.AddressRepo;

@Component
public class AddressService {
  @Autowired
  private AddressRepo addressRepo;

  public Address save(Address address) {
    if (address != null) {
      Address temp = addressRepo.save(address);
      return temp;
    } else {
      return null;
    }
  }
}
