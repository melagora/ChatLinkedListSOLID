package com.kodigo.jd20.chat.model;

import java.time.LocalDateTime;

// 2
public class Message {

    private final User sender;
    private final String content;
    private final LocalDateTime timestamp;

    public Message(User sender, String content, LocalDateTime timestamp) {
        this.sender = sender;
        this.content = content;
        this.timestamp = timestamp;
    }

    public User getSender() {
        return sender;
    }

    public String getContent() {
        return content;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}
