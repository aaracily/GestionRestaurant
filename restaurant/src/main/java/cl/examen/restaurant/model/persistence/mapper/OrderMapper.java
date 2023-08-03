package cl.examen.restaurant.model.persistence.mapper;

import cl.examen.restaurant.model.domain.dto.Order;
import cl.examen.restaurant.model.persistence.entity.OrderEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring",uses ={TableMapper.class, WaiterMapper.class})
public interface OrderMapper {
    @Mappings({
            @Mapping(source="id",target="id"),
            @Mapping(source="mesa",target="table"),
            @Mapping(source="camarero",target="waiter"),
            @Mapping(source="fecha",target="date"),
            @Mapping(source="total",target="total"),

    })
    Order toOrder(OrderEntity orderEntity);
    List<Order> toOrders(List<OrderEntity> orderEntityList);
    @InheritInverseConfiguration
    OrderEntity toOrderEntity(Order order);
}
