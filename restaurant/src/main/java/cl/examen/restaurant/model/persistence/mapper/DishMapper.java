package cl.examen.restaurant.model.persistence.mapper;

import cl.examen.restaurant.model.domain.dto.Dish;
import cl.examen.restaurant.model.persistence.entity.DishEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper (componentModel = "spring")
public interface DishMapper {
    @Mappings({
            @Mapping(source="id",target="id"),
            @Mapping(source="nombre",target="name"),
            @Mapping(source="descripcion",target="description"),
            @Mapping(source="precio",target="price"),
            @Mapping(source="categoria",target="category"),

    })
    Dish toDish(DishEntity dishEntity);
    List<Dish> toDishes (List<DishEntity> dishEntities);
    @InheritInverseConfiguration
    DishEntity toDishEntity(Dish dish);
}
