package com.kodigo.jd20.chat.service;

import com.kodigo.jd20.chat.model.Chat;
import com.kodigo.jd20.chat.model.Message;
import com.kodigo.jd20.chat.model.User;

import java.util.HashMap;
import java.util.Map;

//6
public class ChatService {
    private final Map <String, Chat> chats = new HashMap<>();

    public Chat createChat(String id){
        Chat chat = new Chat(id);
        chats.put(id, chat);
        return chat;
    }

    public void sendMesssage (String chatId, User user, String content){
        Chat chat = chats.get(chatId);
        if (chat != null){
            chat.addMessage(new Message(user, content));
        } else {
            System.out.println("Chat no encontrado");
        }
    }
    public void getMessage (String chatId){
        Chat chat = chats.get(chatId);
        if (chat != null){
            chat.getMessages();
        } else {
            System.out.println("Chat no encontrado");
        }
    }
}
