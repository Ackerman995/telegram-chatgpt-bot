package com.example.telegrambot.openai;

import com.example.telegrambot.openai.api.CreateTranscriptionRequest;
import com.example.telegrambot.openai.api.OpenAIClient;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
@AllArgsConstructor
public class TranscribeVoiceToTextService {

    private final OpenAIClient openAIClient;

    public String transcribe(File audioFile) {
        var response = openAIClient.createTranscription(CreateTranscriptionRequest.builder()
                .audioFile(audioFile)
                .model("whisper-1")
                .build());
        return response.text();
    }

}
