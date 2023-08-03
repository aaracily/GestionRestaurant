package cl.examen.restaurant.model.domain.dto;

import jakarta.persistence.Column;
import lombok.*;

import java.time.LocalDate;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Waiter {
    private int id;
    private String name;
    private int age;
    private LocalDate admission;
}
