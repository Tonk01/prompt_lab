package com.genexperiment.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import com.genexperiment.model.ChatMessage;
import com.genexperiment.model.OllamaResponse;

@Service
public class PromptService {

    private final RestClient restClient;
    private final List<ChatMessage> conversationHistory = new ArrayList<>();


    public PromptService() {
        this.restClient = RestClient.builder().baseUrl("http://localhost:11434").build();
    }

    public OllamaResponse generateResponse(String prompt, double temperature, double top_p, int seed, int maxTokens) {

        conversationHistory.add(new ChatMessage("user", prompt));

        Map<String, Object> body = Map.of(
            "model", "qwen2.5:3b-instruct", 
            "messages", conversationHistory, 
            "stream", false,
            "options", Map.of(
                "temperature", temperature,
                "top_p", top_p,
                "seed", seed,
                "num_predict", maxTokens
            )
        );
         


        OllamaResponse response = restClient.post()
            .uri("/api/chat")
            .body(body)
            .retrieve()
            .body(OllamaResponse.class);

        conversationHistory.add(
            new ChatMessage("assisstant", response.getMessage().getContent())
        );

        return response;
    }
}
