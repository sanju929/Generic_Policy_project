package com.example.zen.engine.travel;


import com.example.zen.engine.travel.dto.TravelQuotation;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class TravelPremiumCalculator {

    public BigDecimal calculate(TravelQuotation dto) {
        BigDecimal premium = BigDecimal.valueOf(50);

        if ("Y".equals(dto.getSportsAct())) {
            premium = premium.add(BigDecimal.valueOf(25));
        }

        premium = premium.multiply(
                BigDecimal.valueOf(dto.getPolRiskFlexi().size())
        );

        return premium;
    }
}
