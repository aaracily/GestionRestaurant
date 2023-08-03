package cl.examen.restaurant.model.persistence.mapper;

import cl.examen.restaurant.model.domain.dto.Waiter;
import cl.examen.restaurant.model.persistence.entity.WaiterEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface WaiterMapper {
    @Mappings({
            @Mapping(source="id",target="id"),
            @Mapping(source="nombre",target="name"),
            @Mapping(source="edad",target="age"),
            @Mapping(source="fechaIngreso",target="admission"),
    })
    Waiter toWaiter(WaiterEntity waiterEntity);
    List<Waiter> toWaiters (List<WaiterEntity> waiterEntityList);
    @InheritInverseConfiguration
    WaiterEntity toWaiterEntity(Waiter waiter);
}
