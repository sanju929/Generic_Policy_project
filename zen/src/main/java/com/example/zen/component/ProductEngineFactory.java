package com.example.zen.component;


import com.example.zen.common.dto.PolicyResponse;
import com.example.zen.common.exception.BusinessException;
import com.example.zen.engine.ProductEngine;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class ProductEngineFactory {

    private final Map<String, ProductEngine> engines;

    public ProductEngineFactory(Map<String, ProductEngine> engines) {
        this.engines = engines;
    }

    public PolicyResponse process(JsonNode json) {
        String productCode = json.get("polProdCode").asText();
        ProductEngine engine = engines.get(productCode);

        if (engine == null) {
            throw new BusinessException("Unsupported product: " + productCode);
        }
        return engine.process(json);
    }
}