package Tata.backend.src.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import Tata.backend.src.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}