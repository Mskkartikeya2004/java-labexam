package com.klef.jfsd.springboot.repository;

import com.klef.jfsd.springboot.model.MutualFund;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MutualFundRepository extends JpaRepository<MutualFund, Long> {
}