package com.example.zen.common.dto;


import java.math.BigDecimal;

public class PolicyResponse {

    public Policy getPolicy() {
        return policy;
    }

    public void setPolicy(Policy policy) {
        this.policy = policy;
    }

    public BigDecimal getPremium() {
        return premium;
    }

    public void setPremium(BigDecimal premium) {
        this.premium = premium;
    }

    private Policy policy;
    private BigDecimal premium;

    public PolicyResponse(Policy policy, BigDecimal premium) {
        this.policy = policy;
        this.premium = premium;
    }

    // getters
}
