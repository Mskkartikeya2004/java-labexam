package com.klef.jfsd.springboot.controller;

import com.klef.jfsd.springboot.model.MutualFund;
import com.klef.jfsd.springboot.service.MutualFundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MutualFundController {
    @Autowired
    private MutualFundService mutualFundService;

    @GetMapping("/")
    public String viewHomePage(Model model) {
        List<MutualFund> mutualFunds = mutualFundService.getAllMutualFunds();
        model.addAttribute("mutualFunds", mutualFunds);
        return "index";
    }

    @PostMapping("/submitPreferences")
    public String submitPreferences(@RequestParam("investmentAmount") double investmentAmount,
                                    @RequestParam("riskTolerance") String riskTolerance,
                                    @RequestParam("investmentDuration") int investmentDuration,
                                    Model model) {
        // Logic to filter mutual funds based on user preferences
        List<MutualFund> mutualFunds = mutualFundService.getAllMutualFunds(); // Replace with actual filtering logic
        model.addAttribute("mutualFunds", mutualFunds);
        return "results";
    }
}