package com.och.redeliverypolicy.processors;

import com.och.redeliverypolicy.config.Constants;
import com.och.redeliverypolicy.dto.MessageDto;
import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MessageProcessor implements Processor {
    private Logger logger = LoggerFactory.getLogger(MessageProcessor.class);

    @Override
    public void process(Exchange exchange) throws Exception {
        Message message = exchange.getMessage();
        logger.info("New message -> {}: {}", message.getMessageId(), message.getBody());
        Constants.MESSAGE_MAP.put(message.getMessageId(), new MessageDto(message));
    }
}
