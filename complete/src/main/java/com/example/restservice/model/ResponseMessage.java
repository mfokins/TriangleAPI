package com.example.restservice.model;

public class ResponseMessage {

    private String content;

    public ResponseMessage(String content) {
        this.content=content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
