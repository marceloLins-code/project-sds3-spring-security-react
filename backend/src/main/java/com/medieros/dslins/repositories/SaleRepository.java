package com.medieros.dslins.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.medieros.dslins.dto.SaleSuccessDTO;
import com.medieros.dslins.dto.SaleSumDTO;
import com.medieros.dslins.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
	
	//JPQL
	@Query("SELECT new com.medieros.dslins.dto.SaleSumDTO(obj.seller, SUM(obj.amount))"
			+ "FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSumDTO> amountGrupedSeller();	
	

	@Query("SELECT new com.medieros.dslins.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals))"
			+ "FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSuccessDTO> successGrupedSeller();	
}
