package com.example.boilerroom_labb1.controller;

import com.example.boilerroom_labb1.entity.Message;
import com.example.boilerroom_labb1.service.MessageService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/messages")
public class MessageController {
    private final MessageService messageService;
    public MessageController(MessageService messageService) {

        this.messageService = messageService;
    }

    @GetMapping
    public List<Message> getAllMessages(){

        return messageService.getAllMessages();
    }


    @GetMapping("/{id}/number")
    public int getMessageNumber(
            @PathVariable Long id){

        return messageService.getNumber(id);
    }

    @GetMapping("/{id}/text")
    public String getMessageText(
            @PathVariable Long id){

        return messageService.getText(id);
    }


    @PostMapping
    public Message createNewMessage(
            @RequestBody
            Message message){
        return messageService.createMessage(
                message.getText(),message.getNumber());
    }
}
