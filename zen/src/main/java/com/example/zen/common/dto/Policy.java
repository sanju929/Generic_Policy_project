package com.example.zen.common.dto;



import java.math.BigDecimal;
import java.time.LocalDate;

public class Policy {

    public String getPolicyNo() {
        return policyNo;
    }

    public void setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
    }

    public BigDecimal getPremium() {
        return premium;
    }

    public void setPremium(BigDecimal premium) {
        this.premium = premium;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    private String policyNo;
    private BigDecimal premium;
    private LocalDate issueDate;

    // getters & setters
}
