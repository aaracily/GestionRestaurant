package cl.examen.restaurant.model.domain.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Dish {
    private int id;
    private String name;
    private String description;
    private float  price;
    private String category;

}
