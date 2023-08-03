package cl.examen.restaurant.model.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="plato")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DishEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private int id;
    @Column(name="Nombre")
    private String nombre;
    @Column(name="Descripcion")
    private String descripcion;
    @Column(name="Precio")
    private float precio;
    @Column(name="Categoria")
    private float categoria;

}
