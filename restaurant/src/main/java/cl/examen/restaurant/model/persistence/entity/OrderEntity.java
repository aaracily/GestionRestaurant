package cl.examen.restaurant.model.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name="pedido")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="Mesa_ID", updatable=false)
    private TableEntity mesa;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="Camarero_ID", updatable=false)
    private WaiterEntity camarero;

    @Column(name="Fecha")
    private LocalDate fecha;
    @Column(name="Total")
    private double total;
}
