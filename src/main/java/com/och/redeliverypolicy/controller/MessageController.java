package com.och.redeliverypolicy.controller;

import com.och.redeliverypolicy.config.Constants;
import com.och.redeliverypolicy.dto.MessageDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.Collection;

@RestController
@RequestMapping(Constants.BASE_PATH + "/message")
public class MessageController {
    @GetMapping("/all")
    public Collection<MessageDto> retrieveMessages() {
        return Constants.MESSAGE_MAP.values();
    }

    @GetMapping("/{id}")
    public MessageDto retrieveMessages(@PathVariable String id) {
        return Constants.MESSAGE_MAP.get(id);
    }
}
