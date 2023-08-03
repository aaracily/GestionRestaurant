package cl.examen.restaurant.web.controller;

import cl.examen.restaurant.model.domain.dto.Dish;
import cl.examen.restaurant.web.service.DishService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/dish")
public class DishRestController {
    //endpoints correspondientes a métodos de CRUD para entidad plato
    private final DishService service;

    public DishRestController(DishService service) {
        this.service = service;
    }
    @GetMapping("/{id}")
    public ResponseEntity<Dish> findById(@PathVariable int dishId){
        return service.findById(dishId)
                .map(teacher -> new ResponseEntity<>(teacher, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @GetMapping
    public ResponseEntity<List<Dish>> findAll(){
        System.out.println("pasa aqui");
        return service.findAll().map(dish -> new ResponseEntity<>(dish, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }



    @PostMapping("/create")
    public ResponseEntity<Dish> create(@RequestBody Dish dish){
        return service.create(dish)
                .map(t-> new ResponseEntity<>(t, HttpStatus.CREATED))
                .orElse(new ResponseEntity<>(HttpStatus.CONFLICT));
    }

    @PatchMapping("/update")
    public ResponseEntity<Dish> update(@RequestBody Dish dish){
        return service.update(dish)
                .map(dish1 -> new ResponseEntity<>(dish1, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable int dishId){
        return new ResponseEntity<Boolean>(service.delete(dishId), HttpStatus.OK);
    }
}
