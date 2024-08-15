package com.example.telegrambot.telegram.command.handler;

import com.example.telegrambot.telegram.command.TelegramCommands;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.Message;

public interface TelegramCommandHandler {
    BotApiMethod<?> processCommand(Message update);

    TelegramCommands getSupportedCommand();
}
