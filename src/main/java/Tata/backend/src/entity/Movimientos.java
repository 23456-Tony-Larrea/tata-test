package Tata.backend.src.entity;

import java.util.Date;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Movimientos")
public class Movimientos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date fecha;
    private String tipoMovimiento;
    private double valor;
    private double saldo;
}