package com.kodigo.jd20.chat.model;
import java.time.LocalDateTime;

// 2
public class Message {
    private final User sender;
    private final String content;
    private final LocalDateTime timestamp;

    public Message(User sender, String content) {
        this.sender = sender;
        this.content = content;
        this.timestamp = LocalDateTime.now(); //timestamp;
    }

    public User getSender() {return sender;}

    public String getContent() {return content;}

    public LocalDateTime getTimestamp() {return timestamp;}

}
