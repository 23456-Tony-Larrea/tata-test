package Tata.backend.src.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import Tata.backend.src.entity.Movimientos;
import Tata.backend.src.repository.MovimientosRepository;

import java.util.List;

@Service
public class MovimientoService {

    @Autowired
    private MovimientosRepository movimientoRepository;

    public List<Movimientos> getAllMovimientos() {
        return movimientoRepository.findAll();
    }

    public ResponseEntity<Movimientos> getMovimientoById(Long id) {
        return movimientoRepository.findById(id)
                .map(movimiento -> ResponseEntity.ok().body(movimiento))
                .orElse(ResponseEntity.notFound().build());
    }

    public Movimientos createMovimiento(Movimientos movimiento) {
        return movimientoRepository.save(movimiento);
    }

    public ResponseEntity<Movimientos> updateMovimiento(Long id, Movimientos movimientoDetails) {
        return movimientoRepository.findById(id)
                .map(movimiento -> {
                    movimiento.setFecha(movimientoDetails.getFecha());
                    movimiento.setTipoMovimiento(movimientoDetails.getTipoMovimiento());
                    movimiento.setValor(movimientoDetails.getValor());
                    movimiento.setSaldo(movimientoDetails.getSaldo());
                    Movimientos updatedMovimiento = movimientoRepository.save(movimiento);
                    return ResponseEntity.ok().body(updatedMovimiento);
                }).orElse(ResponseEntity.notFound().build());
    }

    public void deleteMovimiento(Long id) {
       movimientoRepository.deleteById(id);
    }

}