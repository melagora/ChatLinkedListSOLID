package com.kodigo.jd20.chat.application;

import com.kodigo.jd20.chat.model.Chat;
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

        Chat chat = chatService.createChat("chat1");
        chat.addParticipant(melvin);
        chat.addParticipant(valeria);

        chatService.sendMesssage("chat1", melvin, "Hola Valeria, ¿Todavía estás trabajando en el mismo lugar?");
        chatService.sendMesssage("chat1", valeria, "Holaaaaa, jajaja fijate que sí, aún sigo");
        chatService.sendMesssage("chat1", melvin, "¡Que bueno!, Te escribía para algo :p");

        chatService.getMessage("chat1");
    }
}
