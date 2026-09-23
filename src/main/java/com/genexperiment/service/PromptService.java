package com.genexperiment.service;

import org.springframework.stereotype.Service;

@Service 
public class PromptService {
    public String generateResponse(String prompt, double temperature) {
        return "Recieved prompt: " + prompt +  " | " + temperature;
    }
}
