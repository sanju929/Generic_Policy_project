package com.example.zen.engine.pa;


import com.example.zen.engine.pa.dto.PaQuotation;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class PaPremiumCalculator {

    public BigDecimal calculate(PaQuotation dto) {
        BigDecimal premium = BigDecimal.valueOf(100);

        if ("Y".equals(dto.getSpouseCover())) {
            premium = premium.add(BigDecimal.valueOf(40));
        }

        if ("Y".equals(dto.getChildCover())) {
            premium = premium.add(
                    BigDecimal.valueOf(dto.getNoOfChild() * 20)
            );
        }

        return premium;
    }
}
