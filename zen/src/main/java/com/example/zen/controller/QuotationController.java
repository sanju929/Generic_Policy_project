package com.example.zen.controller;

import com.example.zen.common.dto.PolicyResponse;
import com.example.zen.component.ProductEngineFactory;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quotation")
public class QuotationController {

    private final ProductEngineFactory factory;

    public QuotationController(ProductEngineFactory factory) {
        this.factory = factory;
    }

    @PostMapping
    public PolicyResponse create(@RequestBody JsonNode json) {
        return factory.process(json);
    }
}
