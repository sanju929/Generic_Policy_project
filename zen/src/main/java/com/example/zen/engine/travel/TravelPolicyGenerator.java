package com.example.zen.engine.travel;


import com.example.zen.common.dto.Policy;
import com.example.zen.engine.travel.dto.TravelQuotation;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class TravelPolicyGenerator {

    public Policy generate(TravelQuotation dto, BigDecimal premium) {
        Policy policy = new Policy();
//        policy.setPolicyNo("TRV-" + UUID.randomUUID());
//        policy.setPremium(premium);
//        policy.setIssueDate(LocalDate.now());
        return policy;
    }
}
