package cl.examen.restaurant.model.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name="camarero")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class WaiterEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private int id;
    @Column(name="Nombre")
    private String nombre;
    @Column(name="Edad")
    private int edad;
    @Column(name="Fecha_Inicio")
    private LocalDate fechaIngreso;
}
