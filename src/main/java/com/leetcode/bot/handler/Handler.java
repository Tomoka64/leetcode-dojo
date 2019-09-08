package com.leetcode.bot.handler;

import com.linecorp.bot.model.event.MessageEvent;
import com.linecorp.bot.model.event.message.TextMessageContent;
import com.linecorp.bot.model.message.Message;
import com.linecorp.bot.model.message.TextMessage;
import com.linecorp.bot.spring.boot.annotation.EventMapping;
import com.linecorp.bot.spring.boot.annotation.LineMessageHandler;
import org.springframework.beans.factory.annotation.Autowired;
import com.leetcode.bot.domain.Service;

@LineMessageHandler
public class Handler {
    @Autowired
    private Service service;

    @EventMapping
    public Message handleTextMessageEvent(MessageEvent<TextMessageContent> event) {
        System.out.println("event: " + event);
//        final String originalMessageText = event.getMessage().getText();
        final String originalMessageText = service.handleTextMessageEvent();
        return new TextMessage(originalMessageText);
    }
}
