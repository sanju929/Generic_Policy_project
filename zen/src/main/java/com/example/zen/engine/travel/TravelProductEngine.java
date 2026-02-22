package com.example.zen.engine.travel;


import com.example.zen.common.dto.PolicyResponse;
import com.example.zen.engine.ProductEngine;
import com.example.zen.engine.travel.dto.TravelQuotation;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component("TRVIO")
public class TravelProductEngine implements ProductEngine {

    private final TravelPremiumCalculator calculator;
    private final TravelPolicyGenerator generator;
    private final ObjectMapper mapper;

    public TravelProductEngine(
            TravelPremiumCalculator calculator,
            TravelPolicyGenerator generator,
            ObjectMapper mapper) {
        this.calculator = calculator;
        this.generator = generator;
        this.mapper = mapper;
    }

    @Override
    public PolicyResponse process(JsonNode json) {
        TravelQuotation dto =
                mapper.convertValue(json, TravelQuotation.class);

        BigDecimal premium = calculator.calculate(dto);
        return new PolicyResponse(generator.generate(dto, premium), premium);
    }
}
