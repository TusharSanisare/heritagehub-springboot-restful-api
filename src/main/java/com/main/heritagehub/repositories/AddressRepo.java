package com.main.heritagehub.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.heritagehub.models.Address;

@Repository
public interface AddressRepo extends JpaRepository<Address, Integer> {

}
