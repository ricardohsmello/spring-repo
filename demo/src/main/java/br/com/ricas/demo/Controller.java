package br.com.ricas.demo;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class Controller {

    private final ChatClient chatClient;

    Controller(ChatClient chatClient) {
        this.chatClient = chatClient;
    }


    @GetMapping("/ai")
    Map<String, String> completion(@RequestParam(value = "message", defaultValue = "Who won premier league 2003?") String message) {
        return Map.of(
                "completion",
                chatClient.prompt()
                        .user(message)
                        .call()
                        .content());
    }

}
