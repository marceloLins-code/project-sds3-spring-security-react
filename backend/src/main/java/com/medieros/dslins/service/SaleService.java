package com.medieros.dslins.service;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.medieros.dslins.dto.SaleDTO;
import com.medieros.dslins.entities.Sale;
import com.medieros.dslins.repositories.SaleRepository;
import com.medieros.dslins.repositories.SellerRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository saleRepository;
	
	@Autowired
	private  SellerRepository sellerRepository;
	
	
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable) {
		sellerRepository.findAll();
		Page<Sale> list = saleRepository.findAll(pageable);
		return list.map(x -> new SaleDTO(x));
				}

}
