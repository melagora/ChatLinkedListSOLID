package com.kodigo.jd20.chat.service;

import com.kodigo.jd20.chat.model.Chat;
import com.kodigo.jd20.chat.model.IMessage;
import com.kodigo.jd20.chat.model.Message;
import com.kodigo.jd20.chat.model.User;

import java.util.*;

//6
//Inversión de dependencias

public class ChatService {
    private final Map <String, Chat> chats = new HashMap<>();

    public Chat createChat(){
        Chat chat = new Chat();
        chats.put(chat.getId(),chat);
        return chat;
    }

    //nuevo método
    public void addUserToChat(String chatId, User user){
        Chat chat = chats.get(chatId);
        if (chat != null){
            chat.addParticipant(user);
        }
    }

    public void sendMesssage (String chatId, IMessage message){
        Chat chat = chats.get(chatId);
        if (chat != null){
            chat.addMessage(message);
        }
    }

    public List<IMessage> getMessage (String chatId){
        Chat chat = chats.get(chatId);
        if (chat != null){
            return chat.getMessages().getAll();
        }
        return Collections.emptyList();
    }
}
