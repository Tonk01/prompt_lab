package com.genexperiment.model;

public class PromptResponse {
    private String response;
    private String prompt;
    private double temperature;
    private double top_p;

    public PromptResponse(String response, String prompt, double temperature, double top_p) {
        this.response = response;
        this.prompt = prompt;
        this.temperature = temperature;
        this.top_p = top_p;
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

    public double getTop_p() {
        return top_p;
    }

    public void setTop_p(double top_p) {
        this.top_p = top_p;
    }
}
