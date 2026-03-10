package com.example.boilerroom_labb1.repository;

import com.example.boilerroom_labb1.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MessageRepository extends JpaRepository<Message, Long>
{
}