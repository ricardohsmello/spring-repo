package br.com.ricas.demo;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class ChatController {

    private final ChatClient chatClient;

    ChatController(ChatClient chatClient) {
        this.chatClient = chatClient;
    }

    @GetMapping("/question")
    Map<String, String> completion(@RequestParam(value = "message", defaultValue = "Who won premier league 2004?") String message) {
        return Map.of(
                "completion",
                chatClient.prompt()
                        .user(message)
                        .call()
                        .content());
    }



}
