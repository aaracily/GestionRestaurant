package cl.examen.restaurant.model.domain.service;

import cl.examen.restaurant.model.domain.dto.Dish;
import cl.examen.restaurant.model.persistence.mapper.DishMapper;
import cl.examen.restaurant.model.persistence.repository.DishRepository;
import cl.examen.restaurant.web.service.DishService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class DishServiceImpl implements DishService {
    private final DishRepository repository;
    private final DishMapper mapper;
    @Override
    public Optional<Dish> create(Dish dish) {
        return Optional.of(mapper.toDish(repository.save(mapper.toDishEntity(dish))));
    }

    @Override
    public Optional<List<Dish>> findAll() {
       return Optional.of(mapper.toDishes(repository.findAll()));
    }

    @Override
    public Optional<Dish> update(Dish dish) {
        if (repository.existsById(dish.getId())){
            return Optional.of(mapper.toDish(repository.save(mapper.toDishEntity(dish))));

        }
        return Optional.of(new Dish());

    }

    @Override
    public Optional<Dish> findById(int id) {
        return  repository.findById(id).map(mapper::toDish);
    }

    @Override
    public boolean delete(int id) {
        if (repository.existsById(id)){
            repository.deleteById(id);
            return true;
        }

        return false;

    }
}
