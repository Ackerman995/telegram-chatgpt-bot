package com.example.telegrambot.openai.api;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Choice (
        @JsonProperty("message") Message message
) {

}
