package com.leetcode.bot.domain;

import com.leetcode.bot.usecase.Leetcode;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Service {
    private Leetcode leetcode;
    public String handleTextMessageEvent() {
        return leetcode.handleTextMessageEvent();
    }
}
