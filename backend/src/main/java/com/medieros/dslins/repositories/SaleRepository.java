package com.medieros.dslins.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medieros.dslins.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
