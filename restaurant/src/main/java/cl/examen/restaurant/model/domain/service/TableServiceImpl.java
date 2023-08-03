package cl.examen.restaurant.model.domain.service;

import cl.examen.restaurant.model.domain.dto.Table;
import cl.examen.restaurant.model.persistence.entity.TableEntity;
import cl.examen.restaurant.model.persistence.mapper.TableMapper;
import cl.examen.restaurant.model.persistence.repository.TableRepository;
import cl.examen.restaurant.web.service.TableService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class TableServiceImpl implements TableService {
    private final TableRepository repository;
    private final TableMapper mapper;
    @Override
    public Table findById(int id) {
        return mapper.toTable(repository.findById(id).get());
    }

    @Override
    public List<Table> findAll() {

        return mapper.toTables(repository.findAll());
    }

    @Override
    public Table create(Table table) {

        return mapper.toTable(repository.save(mapper.toTableEntity(table)));
    }
}
