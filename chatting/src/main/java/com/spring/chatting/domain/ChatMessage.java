package com.spring.chatting.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChatMessage {

    public enum MessageType {
        ENTER, TALK;
    }

    private MessageType type;
    private String roomId; //room number
    private String sender;
    private String message;
}
