package com.example.zen.engine.pa;


import com.example.zen.common.dto.Policy;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Component
public class PaPolicyGenerator {

    public Policy generate(BigDecimal premium) {
        Policy policy = new Policy();
//        policy.setPolicyNo("PA-" + UUID.randomUUID());
//        policy.setPremium(premium);
//        policy.setIssueDate(LocalDate.now());
        return policy;
    }
}
