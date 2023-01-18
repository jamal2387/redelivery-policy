package com.och.redeliverypolicy.routes;

import com.och.redeliverypolicy.processors.MessageProcessor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class RedeliveryPolicyRoute extends RouteBuilder {
    private static final int REDELIVERY_DELAY = 5000;
    private static final int MAX_REDELIVERIES = 3;

    @Override
    public void configure() throws Exception {
        from("activemq:redelivery-policy")
                .errorHandler(defaultErrorHandler()
                        .redeliveryDelay(REDELIVERY_DELAY)
                        .maximumRedeliveries(MAX_REDELIVERIES)
                )
                .process(new MessageProcessor())
                .to("log:result");
    }
}
