package edu.altair.apicrm.services;

import edu.altair.apicrm.dtos.ResumenAsistenciaDTO;
import edu.altair.apicrm.repositories.AsistenciaRepository;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AsistenciaService {

    private final AsistenciaRepository asistenciaRepository;

    public AsistenciaService(
            AsistenciaRepository asistenciaRepository) {
        this.asistenciaRepository = asistenciaRepository;
    }

    public List<ResumenAsistenciaDTO> obtenerResumenFaltas(
            Long idAlumno) {
        return asistenciaRepository.obtenerResumenFaltas(idAlumno);
    }
}