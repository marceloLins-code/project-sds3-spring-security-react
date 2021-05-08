package com.medieros.dslins.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medieros.dslins.dto.SellerDTO;
import com.medieros.dslins.entities.Seller;
import com.medieros.dslins.repositories.SellerRepository;

@Service
public class SellerService {
	
	@Autowired
	private SellerRepository sellerRepository;
	
	
	public List<SellerDTO> findAll() {
		List<Seller> list = sellerRepository.findAll();
		return list.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
				}

}
