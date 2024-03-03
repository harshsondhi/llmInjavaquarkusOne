package org.acme.getting.started.llmservice.services;


import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import io.quarkiverse.langchain4j.RegisterAiService;


@RegisterAiService
public interface PoemAiService {



        @SystemMessage("You are a professional poet.")
        @UserMessage("Write a poem about {topic}. The poem should be {lines} lines long. Then send this poem by email.")
        String writePoem(String topic, int lines);


}
