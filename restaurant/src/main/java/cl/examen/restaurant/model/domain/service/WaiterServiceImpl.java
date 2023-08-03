package cl.examen.restaurant.model.domain.service;

import cl.examen.restaurant.model.domain.dto.Waiter;
import cl.examen.restaurant.model.persistence.entity.WaiterEntity;
import cl.examen.restaurant.model.persistence.mapper.WaiterMapper;
import cl.examen.restaurant.model.persistence.repository.WaiterRepository;
import cl.examen.restaurant.web.service.WaiterService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class WaiterServiceImpl implements WaiterService {
    private final WaiterRepository repository;
    private final WaiterMapper mapper;
    @Override
    public Waiter create(Waiter waiter) {
        return mapper.toWaiter(repository.save(mapper.toWaiterEntity(waiter)));
    }

    @Override
    public Waiter findById(int id) {
        Optional<WaiterEntity> op= repository.findById(id);
        if(!op.isPresent()){
            throw new RuntimeException("Mesero/a no encontrado/a");
        }
        return mapper.toWaiter(op.get());
    }

    @Override
    public List<Waiter> finAll() {

        return mapper.toWaiters(repository.findAll());
    }
}
