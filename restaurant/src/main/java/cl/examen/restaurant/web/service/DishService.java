package cl.examen.restaurant.web.service;

import cl.examen.restaurant.model.domain.dto.Dish;

import java.util.List;

public interface DishService {
    Dish create(Dish dish);
    List<Dish> findAll();
    Dish update(Dish dish);
    Dish findById(int id);
    void delete (int id);
}
