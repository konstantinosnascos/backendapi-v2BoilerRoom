package com.example.boilerroom_labb1.controller;

import  com.example.boilerroom_labb1.entity.Message;
import  com.example.boilerroom_labb1.service.MessageService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/messages")
public class MessageController {
    private final MessageService messageService;
    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }
    @PostMapping
    public Message create(){
        return messageService.createMessage("Hej YH",22);
    }
    @GetMapping
    public List<Message> getAllMessages(){
        return messageService.getAllMessages();
    }


}
