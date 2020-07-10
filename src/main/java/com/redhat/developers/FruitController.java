package com.redhat.developers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/spring-fruit")
public class FruitController {

    private SpringFruitRepository fruitRepository;

    public FruitController(SpringFruitRepository fruitRepository) {
        this.fruitRepository = fruitRepository;
    }

    @GetMapping
    public List<Fruit> fruits(@RequestParam("season") String season) {
        if (season != null) {
            return fruitRepository.findBySeason(season);
        }
        return fruitRepository.findAll();
    }

}
