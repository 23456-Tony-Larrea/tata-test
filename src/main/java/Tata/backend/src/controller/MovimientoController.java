package Tata.backend.src.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import Tata.backend.src.entity.Movimientos;
import Tata.backend.src.service.MovimientoService;

import java.util.List;

@RestController
@RequestMapping("/movimientos")
public class MovimientoController {

    @Autowired
    private MovimientoService movimientoService;

    @GetMapping
    public List<Movimientos> getAllMovimientos() {
        return movimientoService.getAllMovimientos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Movimientos> getMovimientoById(@PathVariable Long id) {
        return movimientoService.getMovimientoById(id);
    }

    @PostMapping
    public Movimientos createMovimiento(@RequestBody Movimientos movimiento) {
        return movimientoService.createMovimiento(movimiento);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Movimientos> updateMovimiento(@PathVariable Long id, @RequestBody Movimientos movimientoDetails) {
        return movimientoService.updateMovimiento(id, movimientoDetails);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMovimiento(@PathVariable Long id) {
        movimientoService.deleteMovimiento(id);
        return ResponseEntity.noContent().build();
    }
}