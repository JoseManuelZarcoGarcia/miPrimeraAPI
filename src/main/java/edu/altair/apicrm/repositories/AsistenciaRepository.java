package edu.altair.apicrm.repositories;

import edu.altair.apicrm.entities.Asistencia;
import edu.altair.apicrm.dtos.ResumenAsistenciaDTO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AsistenciaRepository
        extends JpaRepository<Asistencia, Long> {

    @Query("""
        SELECT new edu.altair.apicrm.dtos.ResumenAsistenciaDTO(
            a.asignatura, COUNT(a)
        )
        FROM Asistencia a
        WHERE a.alumno.idAlumno = :idAlumno
          AND UPPER(a.estado) = 'FALTA'
        GROUP BY a.asignatura
        ORDER BY a.asignatura
        """)
    List<ResumenAsistenciaDTO> obtenerResumenFaltas(
            @Param("idAlumno") Long idAlumno);
}