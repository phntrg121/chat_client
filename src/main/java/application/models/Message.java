package application.models;

import java.util.UUID;

public class Message {

    private UUID id;
    private String sender;
    private String receiver;
    private String content;
    private String orderId;
    private String unixTime;

    public Message() {}

    public Message(String sender, String receiver, String content) {
        this.sender = sender;
        this.receiver = receiver;
        this.content = content;
    }

    public Message(UUID id, String orderId, String sender, String receiver, String content) {
        this.id = id;
        this.orderId = orderId;
        this.sender = sender;
        this.receiver = receiver;
        this.content = content;
    }

    public Message(UUID id, String sender, String receiver, String content) {
        this.id = id;
        this.sender = sender;
        this.receiver = receiver;
        this.content = content;
    }

    public UUID getId() {
        return this.id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getSender() {
        return this.sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return this.receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUnixTime() {
        return this.unixTime;
    }

    public void setUnixTime(String unixTime) {
        this.unixTime = unixTime;
    }
}
