package com.kodigo.jd20.chat.model;

import java.time.LocalDateTime;
// v2 paso 1 OCP

public interface IMessage {
    User getSender();

    String getContent();

    String getFormattedText();

}
