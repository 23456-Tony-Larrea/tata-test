package Tata.backend.src.controller;

import Tata.backend.src.service.ReporteService;
import Tata.backend.src.dto.ReporteEstadoCuentaDTO;
import Tata.backend.src.dto.ReporteRequestDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/reportes")
public class ReporteController {

    @Autowired
    private ReporteService reporteService;

       @PostMapping("/estadoCuenta")
    public String solicitarReporteEstadoCuenta(@RequestBody ReporteRequestDTO request) {
        // Enviar el mensaje a RabbitMQ para que el reporte se genere asincrónicamente
        reporteService.solicitarReporte(request);
        return "Solicitud de reporte recibida. El reporte se generará y se enviará en breve.";
    }
}