package com.example.boilerroom_labb1.service;

import com.example.boilerroom_labb1.entity.Message;
import com.example.boilerroom_labb1.repository.MessageRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class MessageService {
    private final MessageRepository messageRepository;
    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }
    public Message createMessage(String text, int number) {
        Message message = new Message(text, number);
        return messageRepository.save(message);
    }

    public List<Message> getAllMessages() {
        return messageRepository.findAll();
    }

    public int getNumber(Long id){

        Message message = messageRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Message not found"));
        return message.getNumber();
    }
}
