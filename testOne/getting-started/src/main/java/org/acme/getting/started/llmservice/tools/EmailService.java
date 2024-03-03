package org.acme.getting.started.llmservice.tools;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import dev.langchain4j.agent.tool.Tool;
import io.quarkus.logging.Log;
import io.quarkus.mailer.Mail;
import io.quarkus.mailer.Mailer;


@ApplicationScoped
public class EmailService {

    @Inject
    Mailer mailer;

    @Tool("send the given content by email")
    public void sendGeneratedContentByEmail(String content) {
        Log.info("Sending an email with generated content: " + content);
        mailer.send(Mail.withText("sendHarshContent@quarkus.io", "A poem generated for Harsh ", content));
    }

}
