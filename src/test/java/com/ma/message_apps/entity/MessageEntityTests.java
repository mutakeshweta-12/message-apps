package com.ma.message_apps.entity;

import org.junit.jupiter.api.Test;
import java.sql.Timestamp;
import static org.junit.jupiter.api.Assertions.*;

public class MessageEntityTests {

    @Test
    void testMessageConstructorAndGetters() {
        User sender = new User();
        sender.setUserId(1);
        User receiver = new User();
        receiver.setUserId(2);
        Timestamp now = new Timestamp(System.currentTimeMillis());
        Message message = new Message(10, sender, receiver, "Hello", false, now);

        assertEquals(10, message.getMessageId());
        assertEquals(sender, message.getSender());
        assertEquals(receiver, message.getReceiver());
        assertEquals("Hello", message.getMessageText());
        assertFalse(message.getIsRead());
        assertEquals(now, message.getCreatedAt());
    }

    @Test
    void testSetters() {
        Message message = new Message();
        User sender = new User();
        sender.setUserId(3);
        message.setSender(sender);
        message.setMessageText("Test");
        message.setIsRead(true);

        assertEquals(sender, message.getSender());
        assertEquals("Test", message.getMessageText());
        assertTrue(message.getIsRead());
    }

    @Test
    void testEqualsAndHashCode() {
        User sender = new User();
        sender.setUserId(1);
        User receiver = new User();
        receiver.setUserId(2);
        Timestamp now = new Timestamp(System.currentTimeMillis());
        Message m1 = new Message(1, sender, receiver, "Hi", true, now);
        Message m2 = new Message(1, sender, receiver, "Hi", true, now);
        assertEquals(m1, m2);
        assertEquals(m1.hashCode(), m2.hashCode());
    }
}

