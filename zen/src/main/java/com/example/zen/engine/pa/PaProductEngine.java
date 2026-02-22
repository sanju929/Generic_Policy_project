package com.example.zen.engine.pa;



import com.example.zen.common.dto.PolicyResponse;
import com.example.zen.engine.ProductEngine;
import com.example.zen.engine.pa.dto.PaQuotation;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component("PA")
public class PaProductEngine implements ProductEngine {

    private final PaPremiumCalculator calculator;
    private final PaPolicyGenerator generator;
    private final ObjectMapper mapper;

    public PaProductEngine(
            PaPremiumCalculator calculator,
            PaPolicyGenerator generator,
            ObjectMapper mapper) {
        this.calculator = calculator;
        this.generator = generator;
        this.mapper = mapper;
    }

    @Override
    public PolicyResponse process(JsonNode json) {
        PaQuotation dto =
                mapper.convertValue(json, PaQuotation.class);

        BigDecimal premium = calculator.calculate(dto);
        return new PolicyResponse(generator.generate(premium), premium);
    }
}
