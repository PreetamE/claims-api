package com.example.claims.service;


import com.example.claims.model.Claim;
import com.example.claims.model.ClaimStatus;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;


@Service
public class ClaimService {

    private final Map<Long, Claim> claimMap = new HashMap<>();


    public ClaimService(){
        claimMap.put(1L, new Claim(1L,"CLM001", new BigDecimal("1000.00"), ClaimStatus.SUBMITTED, LocalDate.now()));
        claimMap.put(2L, new Claim(2L, "CLM002", new BigDecimal("750.50"),ClaimStatus.APPROVED,LocalDate.now().minusDays(2)));

    }
    public Optional<Claim> getClaimById(Long id){
        return Optional.ofNullable(claimMap.get(id));
    }
}
