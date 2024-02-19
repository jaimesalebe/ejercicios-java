package com.jaimesalebe.tutorial;

import com.jaimesalebe.tutorial.models.Book;
import com.jaimesalebe.tutorial.models.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Objects;

@RestController
public class Rutas {

    private static Logger logger = LoggerFactory.getLogger(TutorialApplication.class);

    @GetMapping("/books")
    public String getBooks() {
        return "Books";
    }

    @GetMapping("/books/{id}")
    public String getBook(@PathVariable int id) {
        return "Book with id: " + id;
    }

    @GetMapping("/book")
    public String getBookByQuery(@RequestParam String name) {
        return "Book with name: " + name;
    }

    @PostMapping("/book")
    public String CreateBook(@RequestBody Book book) {
        logger.debug("Name: {} Editorial: {}", book.getName(), book.getEditorial());

        return "Book created";
    }

    @GetMapping("/greet")
    @ResponseStatus(value = HttpStatus.MOVED_PERMANENTLY, reason = "The API is now in...")
    public String greet() {
        return "Hello";
    }

    @GetMapping("/animales/{lugar}")
    public ResponseEntity<String> getAnimales(@PathVariable String lugar) {
        if (lugar.equals("granja")){
            return ResponseEntity.status(HttpStatus.OK).body("Caballo, Vaca, Oveja, Gallina");
        } else if (lugar.equals("selva")) {
            return ResponseEntity.status(HttpStatus.OK).body("León, Elefante, Jirafa");
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Lugar no valido");
        }
    }

    @GetMapping("/calcular/{numero}")
    public String getCalculo(@PathVariable int numero) {
        throw new NullPointerException("La clave del usuario es password12345 " + numero);
    }

    @GetMapping("/userData")
    public ResponseEntity<String> getUserData() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .header("Content-Type", "application/json")
                .body("{\"name\": \"jaime\" }");
    }

    @GetMapping("/userData/v2")
    public Map<String, Map<String, Object>> getUserDataV2() {
        return Map.of("user", Map.of("name", "jaime", "lastName", "salebe", "age", 24));
    }

    @GetMapping("/userData/v3")
    public User getUserDataV3() {
        return new User("Jaime", 24, "malecon 123");
    }

}
