package cl.examen.restaurant.web.service;

import cl.examen.restaurant.model.domain.dto.Table;

import java.util.List;

public interface TableService {
    Table findById(int id);
    List<Table> findAll();
    Table create(Table table);
}
