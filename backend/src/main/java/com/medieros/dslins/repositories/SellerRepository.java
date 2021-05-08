package com.medieros.dslins.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medieros.dslins.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
