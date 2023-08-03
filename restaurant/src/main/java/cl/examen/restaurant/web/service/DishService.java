package cl.examen.restaurant.web.service;

import cl.examen.restaurant.model.domain.dto.Dish;

import java.util.List;
import java.util.Optional;

public interface DishService {
    Optional<Dish> create(Dish dish);
   Optional<List<Dish>>  findAll();
    Optional<Dish> update(Dish dish);
    Optional<Dish> findById(int id);
   boolean delete (int id);
}
