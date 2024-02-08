package com.jaimesalebe.backend.Controllers;

import com.jaimesalebe.backend.Entities.Usuario;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UsuarioController {
    static List<Usuario> usuarios = new ArrayList<>();

    @GetMapping("/usuarios")
    public List<Usuario> getUsuarios () {
        return usuarios;
    }

    @DeleteMapping("/usuarios/{id}")
    public List<Usuario> deleteUsuario (@PathVariable String id) {
        
        for (Usuario user : usuarios) {
            if (id.equals(user.getId().toString())) {
                usuarios.remove(user);
            }
        }

        return usuarios;
    }

    @PostMapping("/usuarios")
    public List<Usuario> postUsuario (@RequestBody Usuario usuario) {
        usuarios.add(usuario);
        return usuarios;
    }
}
