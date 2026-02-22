package com.example.zen.engine.cpe;


import com.example.zen.engine.cpe.dto.CpeQuotation;
import com.example.zen.engine.cpe.dto.Equipment;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class CpePremiumCalculator {

    public BigDecimal calculate(CpeQuotation dto) {
        BigDecimal total = BigDecimal.ZERO;

        if (dto.getPolRiskFlexi() != null) {
            for (Equipment eq : dto.getPolRiskFlexi()) {
                BigDecimal itemPremium = eq.getValue().multiply(new BigDecimal("0.02"));
                total = total.add(itemPremium);
            }
        }

        return total;
    }
}
