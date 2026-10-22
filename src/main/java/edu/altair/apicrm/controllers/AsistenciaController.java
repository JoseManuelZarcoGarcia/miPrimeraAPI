package edu.altair.apicrm.controllers;

import edu.altair.apicrm.dtos.ResumenAsistenciaDTO;
import edu.altair.apicrm.services.AsistenciaService;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/asistencias")
public class AsistenciaController {

    private final AsistenciaService asistenciaService;

    public AsistenciaController(AsistenciaService asistenciaService) {
        this.asistenciaService = asistenciaService;
    }

    @GetMapping("/alumno/{idAlumno}/resumen")
    public List<ResumenAsistenciaDTO> obtenerResumen(
            @PathVariable Long idAlumno) {
        return asistenciaService.obtenerResumenFaltas(idAlumno);
    }
}