package com.medieros.dslins.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medieros.dslins.dto.SaleDTO;
import com.medieros.dslins.dto.SaleSuccessDTO;
import com.medieros.dslins.dto.SaleSumDTO;
import com.medieros.dslins.service.SaleService;

@RestController
@RequestMapping(value ="/sales")
public class SaleController {

		@Autowired
		private SaleService saleService;
		
		
		@GetMapping
		public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable){
			Page<SaleDTO> list = saleService.findAll(pageable);
			return ResponseEntity.ok(list);			
		}
		
		@GetMapping(value = "/amount-By-Seller")
		public ResponseEntity<List<SaleSumDTO>> amountGrupedSeller(){
			List<SaleSumDTO> list = saleService.amountGrupedSeller();
			return ResponseEntity.ok(list);
			
		}
		
		@GetMapping(value = "/success-By-Seller")
		public ResponseEntity<List<SaleSuccessDTO>> successGrupedSeller(){
			List<SaleSuccessDTO> list = saleService.successGrupedSeller();
			return ResponseEntity.ok(list);
			
		}
	
	
}
