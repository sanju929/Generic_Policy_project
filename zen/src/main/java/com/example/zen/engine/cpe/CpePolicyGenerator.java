package com.example.zen.engine.cpe;


import com.example.zen.common.dto.Policy;
import com.example.zen.engine.cpe.dto.CpeQuotation;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Component
public class CpePolicyGenerator {

    public Policy generate(CpeQuotation dto, BigDecimal premium) {
        Policy policy = new Policy();
        policy.setPolicyNo("CPE-" + UUID.randomUUID());
        policy.setPremium(premium);
        policy.setIssueDate(LocalDate.now());
        return policy;
    }
}
