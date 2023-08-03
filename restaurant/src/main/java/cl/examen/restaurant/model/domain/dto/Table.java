package cl.examen.restaurant.model.domain.dto;

import jakarta.persistence.Column;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Table {
    private int id;
    private int number;
    private int seats;
    private String location;
}
