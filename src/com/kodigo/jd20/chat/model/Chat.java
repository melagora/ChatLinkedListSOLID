package com.kodigo.jd20.chat.model;

import com.kodigo.jd20.chat.datastructure.MessageLinkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

//5
public class Chat {
    private final String id = UUID.randomUUID().toString();
    private final List <User> participants = new ArrayList<>();
    private final MessageLinkedList messages = new MessageLinkedList();

    public void addParticipant(User user){
        participants.add(user);
    }

    public void addMessage(IMessage message){
        messages.add(message);
    }

    public MessageLinkedList getMessages() {
        return messages;
    }

    public String getId() {
        return id;
    }

    public List<User> getParticipants() {
        return participants;
    }
}
