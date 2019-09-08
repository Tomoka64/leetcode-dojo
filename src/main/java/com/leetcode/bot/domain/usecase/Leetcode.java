package com.leetcode.bot.domain.usecase;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Leetcode {
    public String handleTextMessageEvent() {
        return "Hello world Leetcode";
    }
}
