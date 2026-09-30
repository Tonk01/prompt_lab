package com.genexperiment.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OllamaResponse {
    private OllamaMessage message;

    @JsonProperty("prompt_eval_count")
    private int promptEvalCount;

    @JsonProperty("eval_count")
    private int evalCount;


    public OllamaMessage getMessage() {
        return message;
    }

    public void setMessage(OllamaMessage message) {
        this.message = message;
    }

    public int getPromptEvalCount() {
        return promptEvalCount;
    }

    public void setPromptEvalCount(int promptEvalCount) {
        this.promptEvalCount = promptEvalCount;
    }

    public int getEvalCount() {
        return evalCount;
    }

    public void setEvalCount(int evalCount) {
        this.evalCount = evalCount;
    }
}
