package com.genexperiment.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import com.genexperiment.model.OllamaResponse;

@Service
public class PromptService {

    private final RestClient restClient;


    public PromptService() {
        this.restClient = RestClient.builder().baseUrl("http://localhost:11434").build();
    }

    public String generateResponse(String prompt, double temperature) {

        Map<String, Object> body = Map.of("model", "qwen2.5:3b-instruct", "messages", List.of
            (Map.of("role", "user", "content", prompt)), "stream", false, "options",
            Map.of("temperature", temperature));



        OllamaResponse response = restClient.post()
            .uri("/api/chat")
            .body(body)
            .retrieve()
            .body(OllamaResponse.class);

        return response.getMessage().getContent();
    }
}
