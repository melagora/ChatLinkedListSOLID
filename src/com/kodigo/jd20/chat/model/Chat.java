package com.kodigo.jd20.chat.model;

import com.kodigo.jd20.chat.datastructure.MessageLinkedList;

import java.util.ArrayList;
import java.util.List;

//5
public class Chat {
    private final String id;
    private final List <User> participants;
    private final MessageLinkedList messages;

    public Chat(String id) {
        this.id = id;
        this.participants = new ArrayList<>();
        this.messages = new MessageLinkedList();
    }

    public void addParticipant(User user){
        participants.add(user);
    }

    public void addMessage(Message message){
        messages.add(message);
    }

    public void getMessages(){
        if (messages.isEmpty()){
            System.out.println("No hay mensajes aún en el chat.");
        }else{
            messages.showAll();
        }
    }

    public List<User> getParticipants() {
        return participants;
    }
}
