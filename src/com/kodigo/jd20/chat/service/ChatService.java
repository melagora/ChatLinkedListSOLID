package com.kodigo.jd20.chat.service;

import com.kodigo.jd20.chat.model.Chat;

import java.util.HashMap;
import java.util.Map;

//6
public class ChatService {
    private final Map <String, Chat> chats = new HashMap<>();

    public Chat createChatString(String id){
        Chat chat = new Chat(id);
        chats.put(id, chat);
        return chat;
    }
}
