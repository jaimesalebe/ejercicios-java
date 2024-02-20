package com.jaimesalebe.tutorial.services;

import com.jaimesalebe.tutorial.TutorialApplication;
import com.jaimesalebe.tutorial.models.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;

public class OrderService implements IOrderService {

    @Value("${misurls.database}")
    private String databaseUrl;

    private static Logger logger = LoggerFactory.getLogger(OrderService.class);
    public void saveOrder(List<Product> products) {
        System.out.println("Saving on database... url: " + databaseUrl);
        products.forEach(product -> logger.debug("El nombre del producto: {} - Precio: {}", product.name, product.price));
    }
}
