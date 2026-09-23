package com.genexperiment.model;

public class PromptResponse {
    private String response;
    private String prompt;
    private double temperature;

    public PromptResponse(String response, String prompt, double temperature) {
        this.response = response;
        this.prompt = prompt;
        this.temperature = temperature;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getPrompt() {
        return prompt;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}
