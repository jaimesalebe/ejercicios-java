package com.jaimesalebe.autocompletado;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BusquedaController {
    @GetMapping("/busqueda-usuarios/{busqueda}")
    public String[] obtenerPalabrasAutocompletar (@PathVariable String busqueda) {

        String[] usuarios = {"Jaime Salebe", "Glenis Roqueme", "Angie Salebe", "Cristhian Peña"};
        String[] listaResultados = new String[usuarios.length];
        int contador = 0;
        for (String usuario: usuarios) {
            if (usuario.toLowerCase().contains(busqueda.toLowerCase())) {
                listaResultados[contador] = usuario;
                contador ++;
            }
        }
        String[] resultadoFinal = new String[contador];
        System.arraycopy(listaResultados, 0, resultadoFinal, 0, contador);

        return resultadoFinal;
    }
}
