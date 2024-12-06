package com.klef.jfsd.springboot.service;

import com.klef.jfsd.springboot.model.MutualFund;
import com.klef.jfsd.springboot.repository.MutualFundRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MutualFundService {
    @Autowired
    private MutualFundRepository mutualFundRepository;

    public List<MutualFund> getAllMutualFunds() {
        return mutualFundRepository.findAll();
    }

    public MutualFund saveMutualFund(MutualFund mutualFund) {
        return mutualFundRepository.save(mutualFund);
    }

    public MutualFund getMutualFundById(Long id) {
        return mutualFundRepository.findById(id).orElse(null);
    }

    public void deleteMutualFund(Long id) {
        mutualFundRepository.deleteById(id);
    }
}