package Tata.backend.src.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Tata.backend.src.entity.Cuenta;

public interface CuentaRepository extends JpaRepository<Cuenta, Long> {
}