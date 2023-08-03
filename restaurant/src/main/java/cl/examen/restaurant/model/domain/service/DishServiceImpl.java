package cl.examen.restaurant.model.domain.service;

import cl.examen.restaurant.model.domain.dto.Dish;
import cl.examen.restaurant.model.persistence.mapper.DishMapper;
import cl.examen.restaurant.model.persistence.repository.DishRepository;
import cl.examen.restaurant.web.service.DishService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class DishServiceImpl implements DishService {
    private final DishRepository repository;
    private final DishMapper mapper;
    @Override
    public Dish create(Dish dish) {
        return repository.save(mapper.toDishEntity(dish));
    }

    @Override
    public List<Dish> findAll() {
        return null;
    }

    @Override
    public Dish update(Dish dish) {
        return null;
    }

    @Override
    public Dish findById(int id) {
        return null;
    }

    @Override
    public void delete(int id) {

    }
}
