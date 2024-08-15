package com.example.telegrambot.openai;

import com.example.telegrambot.openai.api.Message;
import lombok.Builder;
import java.util.List;

@Builder
public record ChatHistory(
        List<Message> chatMessages
) {
}
