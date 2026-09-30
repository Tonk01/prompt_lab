package com.genexperiment.model;

public class PromptResponse {
    private String response;
    private String prompt;
    private double temperature;
    private double top_p;
    private int seed;
    private int maxTokens;
    private int promptTokens;
    private int generatedTokens;

    public PromptResponse(String response, String prompt, double temperature, double top_p, int seed, int maxTokens, int promptTokens, int generatedTokens) {
        this.response = response;
        this.prompt = prompt;
        this.temperature = temperature;
        this.top_p = top_p;
        this.seed = seed;
        this.maxTokens = maxTokens;
        this.promptTokens = promptTokens;
        this.generatedTokens = generatedTokens;
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

    public int getSeed() {
        return seed;
    }

    public void setSeed(int seed) {
        this.seed = seed;
    }

    public int getMaxTokens() {
        return maxTokens;
    }

    public void setMaxTokens(int maxTokens) {
        this.maxTokens = maxTokens;
    }

    public int getPromptTokens() {
        return promptTokens;
    }

    public void setPromptTokens(int promptTokens) {
        this.promptTokens = promptTokens;
    }

    public int getGeneratedTokens() {
        return generatedTokens;
    }

    public void setGeneratedTokens(int generatedTokens) {
        this.generatedTokens = generatedTokens;
    }
}
