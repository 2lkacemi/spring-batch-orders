package com.batch.springbatchexample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

public class OrderItemProcessor implements ItemProcessor<Order,Order> {

    private static final Logger log = LoggerFactory.getLogger(OrderItemProcessor.class);

    @Override
    public Order process(final Order order) throws Exception {
        final String note = order.getNote().toUpperCase();

        final Order transformedOrder = new Order(note);

        log.info("Converting (" + order + ") into (" + transformedOrder + ")");

        return transformedOrder;
    }
}
