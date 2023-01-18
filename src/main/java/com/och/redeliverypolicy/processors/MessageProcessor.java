package com.och.redeliverypolicy.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MessageProcessor implements Processor {
    private Logger logger = LoggerFactory.getLogger(MessageProcessor.class);

    @Override
    public void process(Exchange exchange) throws Exception {
        logger.info("MessageProcessor: {}", exchange.getMessage().getBody());
    }
}
