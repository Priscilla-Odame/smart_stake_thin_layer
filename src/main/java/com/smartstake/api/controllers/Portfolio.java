package com.smartstake.api.controllers;

import com.smartstake.api.dto.PortfolioDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/portfolio")
public class Portfolio {
    @PostMapping("/create")
    public void createPortfolio(@RequestBody PortfolioDTO portfolioDTO) {

    }
}