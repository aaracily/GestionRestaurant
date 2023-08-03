package cl.examen.restaurant.model.domain.dto;

import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Order {
    private int id;
    private Table table;
    private Waiter waiter;
    private LocalDate date;
    private double total;
}
