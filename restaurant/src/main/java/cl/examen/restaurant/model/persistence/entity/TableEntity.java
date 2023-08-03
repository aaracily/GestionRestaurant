package cl.examen.restaurant.model.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name="mesa")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TableEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private int id;
    @Column(name="Numero")
    private int numero;
    @Column(name="Capacidad")
    private int capacidad;
    @Column(name="Ubicacion")
    private String ubicacion;
}
