package Tata.backend.src.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
public class Cliente extends Persona implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(nullable = true)
    private String clienteId;

    @Column(nullable = false)
    private String contraseña;

    private boolean estado;
}