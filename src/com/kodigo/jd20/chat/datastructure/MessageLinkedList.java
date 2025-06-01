package com.kodigo.jd20.chat.datastructure;

import com.kodigo.jd20.chat.model.IMessage;

import java.util.ArrayList;
import java.util.List;

//4
public class MessageLinkedList {
    private MessageNode head;

    public void add(IMessage message){
        //Creamos el nodo con el "message" que nos proporcionan
        MessageNode newMessageNode = new MessageNode(message);

        if (head == null){
            head = newMessageNode;
        } else{
            MessageNode current = head;
            while (current.getNext() != null){
                current = current.getNext();
            }
            current.setNext(newMessageNode);
        }
    }

    public List<IMessage> getAll (){
        List<IMessage> messages = new ArrayList<>();
        MessageNode current = head;
        while (current != null){
            messages.add(current.getMessage());
            current = current.getNext();
        }
        return messages;
    }

    public boolean isEmpty(){
        return head == null;
    }
}
