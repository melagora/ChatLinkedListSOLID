package com.kodigo.jd20.chat.application;

import com.kodigo.jd20.chat.model.Chat;
import com.kodigo.jd20.chat.model.IMessage;
import com.kodigo.jd20.chat.model.TextMessages;
import com.kodigo.jd20.chat.model.User;
import com.kodigo.jd20.chat.service.ChatService;
import com.kodigo.jd20.chat.service.UserService;

public class Main {
    public static void main (String [] args){

        //Creamos nuestros servicios: repositorios y manejo de usuarios y chats
        UserService userService = new UserService();
        ChatService chatService = new ChatService();

        //Creamos nuestros usuarios
        User melvin = userService.createUSer ("1","Melvin");
        User valeria = userService.createUSer ("2","Valeria");

        Chat chat = chatService.createChat();
        chatService.addUserToChat(chat.getId(), melvin);
        chatService.addUserToChat(chat.getId(), valeria);

        //IMessage txtMessage1 = new TextMessages(melvin, "Hola Valeria, ¿Todavía estás trabajando en el mismo lugar?");
        //chatService.sendMesssage(chat.getId(), txtMessage1);

        chatService.sendMesssage(chat.getId(), new TextMessages (melvin, "Hola Valeria, ¿Todavía estás trabajando en el mismo lugar?"));
        chatService.sendMesssage(chat.getId(), new TextMessages (valeria, "Holaaaaa, jajaja fijate que sí, aún sigo"));
        chatService.sendMesssage(chat.getId(), new TextMessages (melvin, "¡Que bueno!, Te escribía para algo :p"));
        chatService.sendMesssage(chat.getId(), new TextMessages (valeria, "Me lo imagine :v"));

        for (IMessage message : chatService.getMessage(chat.getId())){
            System.out.println(message.getFormattedText());
        }
    }
}
