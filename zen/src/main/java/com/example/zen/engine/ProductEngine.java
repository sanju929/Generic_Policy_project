package com.example.zen.engine;



import com.example.zen.common.dto.PolicyResponse;
import com.fasterxml.jackson.databind.JsonNode;

public interface ProductEngine {
    PolicyResponse process(JsonNode quotationJson);
}
