package com.jaimesalebe.tutorial.services;

import com.jaimesalebe.tutorial.models.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IOrderService {

    public void saveOrder(List<Product> products);
}
