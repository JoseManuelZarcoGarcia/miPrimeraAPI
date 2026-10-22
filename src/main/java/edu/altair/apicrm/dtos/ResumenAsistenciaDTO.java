package edu.altair.apicrm.dtos;

public class ResumenAsistenciaDTO {

    private String asignatura;
    private Long faltas;

    public ResumenAsistenciaDTO(String asignatura, Long faltas) {
        this.asignatura = asignatura;
        this.faltas = faltas;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public Long getFaltas() {
        return faltas;
    }
}