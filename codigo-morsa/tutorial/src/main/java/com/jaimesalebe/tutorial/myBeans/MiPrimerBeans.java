package com.jaimesalebe.tutorial.myBeans;

import com.jaimesalebe.tutorial.models.MyBean;
import com.jaimesalebe.tutorial.models.Product;
import com.jaimesalebe.tutorial.services.IOrderService;
import com.jaimesalebe.tutorial.services.OrderService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class MiPrimerBeans {

    @Bean
    MyBean createMyBean() {
        return new MyBean();
    }

    @Bean
    public IOrderService instanciarOrderService() {
        boolean esProduccion = true;

        if (esProduccion) {
            return new OrderService();
        }
        return new IOrderService() {
            @Override
            public void saveOrder(List<Product> products) {
                System.out.println("Guardando en base de datos dummy (local)");
            }
        };
    }
}
