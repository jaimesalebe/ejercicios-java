package com.jaime.jsonplaceholder;

import com.jaime.jsonplaceholder.models.Character;
import com.jaime.jsonplaceholder.models.Characters;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
public class JsonplaceholderController {

    @GetMapping("/posts")
    public Post[] getPosts() {
        RestTemplate restTemplate = new RestTemplate();
        String apiUrl = "https://jsonplaceholder.typicode.com/posts/";
        return restTemplate.getForObject(apiUrl, Post[].class);
    }

    @GetMapping("/posts/{id}")
    public Post getPost(@PathVariable long id) {
        RestTemplate restTemplate = new RestTemplate();
        String apiUrl = "https://jsonplaceholder.typicode.com/posts/" + id;
        return restTemplate.getForObject(apiUrl, Post.class);
    }

    @GetMapping("/character")
    public Characters getCharacters() {
        RestTemplate restTemplate = new RestTemplate();
        String apiUrl = "https://rickandmortyapi.com/api/character";
        return restTemplate.getForObject(apiUrl, Characters.class);
    }
    @GetMapping("/character/{id}")
    public Character getCharacter(@PathVariable int id) {
        RestTemplate restTemplate = new RestTemplate();
        String apiUrl = "https://rickandmortyapi.com/api/character/" + id;
        return restTemplate.getForObject(apiUrl, Character.class);
    }

}
