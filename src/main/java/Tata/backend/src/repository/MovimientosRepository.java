package Tata.backend.src.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import Tata.backend.src.entity.Movimientos;

public interface MovimientosRepository extends JpaRepository<Movimientos, Long> {
}
