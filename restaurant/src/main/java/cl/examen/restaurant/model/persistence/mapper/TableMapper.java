package cl.examen.restaurant.model.persistence.mapper;

import cl.examen.restaurant.model.domain.dto.Table;
import cl.examen.restaurant.model.persistence.entity.TableEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TableMapper {
@Mappings({
        @Mapping(source="id",target="id"),
        @Mapping(source="numero",target="number"),
        @Mapping(source="capacidad",target="seats"),
        @Mapping(source="ubicacion",target="location"),

})
    Table toTable(TableEntity tableEntity);
    List<Table> toTables(List<TableEntity> tableEntityList);
    @InheritInverseConfiguration
    TableEntity toTableEntity(Table table);
}