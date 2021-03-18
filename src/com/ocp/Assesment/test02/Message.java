package com.ocp.Assesment.test02;

/**
 * Created by Kanat KB on 03.07.2017.
 * D. A compiler error occurs on line 3. (11)
 */

public abstract class Message {
    public String recipient;

    //  public abstract final void sendMessage();
    public abstract void sendMessage();

    public static void main(String[] args) {
        Message m = new TextMessage();
        m.recipient = "1234567890";
        m.sendMessage();
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    static class TextMessage extends Message {
        public final void sendMessage() {
            System.out.println("Text message to " + recipient);
        }
    }
}