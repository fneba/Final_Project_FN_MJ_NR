package com.company.gamestore.repositories;

import com.company.gamestore.models.Fee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface ProcessingFeeRepository extends JpaRepository<Fee, String> {

    Double findFeeByProductType(String itemType);
}
