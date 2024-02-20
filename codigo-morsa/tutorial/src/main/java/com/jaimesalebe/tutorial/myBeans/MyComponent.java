package com.jaimesalebe.tutorial.myBeans;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    public void saludarDesdeComponente(){
        System.out.println("Saludo desde componente");
    }
}
