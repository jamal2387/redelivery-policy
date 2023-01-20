package com.och.redeliverypolicy.dto;

import org.apache.camel.Message;

public class MessageDto {
    private String id;
    private String message;

    public MessageDto(String id, String message) {
        this.id = id;
        this.message = message;
    }

    public MessageDto(Message message) {
        this.id = message.getMessageId();
        this.message = message.getBody(String.class);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
