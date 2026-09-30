package com.genexperiment.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.genexperiment.model.OllamaResponse;
import com.genexperiment.model.PromptRequest;
import com.genexperiment.model.PromptResponse;
import com.genexperiment.service.PromptService;


@RestController 
public class PromptController {

    private final PromptService promptService;

    public PromptController(PromptService promptService) {
        this.promptService = promptService;
    }


    @PostMapping("/prompt")
    public PromptResponse handlePrompt(@RequestBody PromptRequest request) {
        OllamaResponse ollamaResponse = promptService.generateResponse(
            request.getPrompt(), 
            request.getTemperature(), 
            request.getTop_p(), 
            request.getSeed(), 
            request.getMaxTokens());

        return new PromptResponse(ollamaResponse.getMessage().getContent(), 
            request.getPrompt(), 
            request.getTemperature(),
            request.getTop_p(),
            request.getSeed(),
            request.getMaxTokens(),
            ollamaResponse.getPromptEvalCount(),
            ollamaResponse.getEvalCount()
        );
    }
}
