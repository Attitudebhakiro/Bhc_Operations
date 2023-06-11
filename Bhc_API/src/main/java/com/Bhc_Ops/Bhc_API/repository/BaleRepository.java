package com.Bhc_Ops.Bhc_API.repository;

import com.Bhc_Ops.Bhc_API.model.Bale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BaleRepository extends JpaRepository <Bale, Long> {
//    boolean existsByBarcode();
}
