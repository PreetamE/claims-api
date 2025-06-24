package com.example.claims.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Claim{
    private Long id;
    private String claimNumber;
    private BigDecimal claimAmount;
    private ClaimStatus claimStatus;
    private LocalDate submittedDate;

    public Claim(Long id, String claimNumber, BigDecimal claimAmount, ClaimStatus claimStatus, LocalDate submittedDate) {
        this.id = id;
        this.claimNumber = claimNumber;
        this.claimAmount = claimAmount;
        this.claimStatus = claimStatus;
        this.submittedDate = submittedDate;
    }

    public Long getId() { return id;}
    public String getClaimNumber(){ return claimNumber; }
    public BigDecimal getClaimAmount() { return claimAmount; }
    public ClaimStatus getClaimStatus() { return claimStatus; }
    public LocalDate getSubmittedDate() { return submittedDate; }

    public void setId(Long id) { this.id = id; }
    public void setClaimNumber(String claimNumber) { this.claimNumber = claimNumber; }
    public void setClaimAmount(BigDecimal claimAmount) { this.claimAmount = claimAmount; }
    public void setClaimStatus(ClaimStatus claimStatus) { this.claimStatus = claimStatus; }
    public void setSubmittedDate(LocalDate submittedDate) { this.submittedDate = submittedDate; }

}