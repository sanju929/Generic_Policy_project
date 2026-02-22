package com.example.zen.engine.cpe;

import com.example.zen.common.dto.PolicyResponse;
import com.example.zen.engine.ProductEngine;
import com.example.zen.engine.cpe.dto.CpeQuotation;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component("CPE")  // ✅ Bean name must match polProdCode
public class CpeProductEngine implements ProductEngine {

    private final ObjectMapper mapper;
    private final CpePremiumCalculator calculator;
    private final CpePolicyGenerator generator;

    public CpeProductEngine(ObjectMapper mapper, CpePremiumCalculator calculator, CpePolicyGenerator generator) {
        this.mapper = mapper;
        this.calculator = calculator;
        this.generator = generator;
    }

    @Override
    public PolicyResponse process(JsonNode json) {
        CpeQuotation dto = mapper.convertValue(json, CpeQuotation.class);

        BigDecimal premium = calculator.calculate(dto);
        return new PolicyResponse(generator.generate(dto, premium), premium);
    }
}
