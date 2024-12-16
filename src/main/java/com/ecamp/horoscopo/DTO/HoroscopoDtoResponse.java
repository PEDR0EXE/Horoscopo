package com.ecamp.horoscopo.DTO;

import java.time.LocalDate;

public class HoroscopoDtoResponsive {
    private String animal;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    // Constructores

    public HoroscopoDtoResponsive() {
    }

    public HoroscopoDtoResponsive(String animal, LocalDate fechaInicio, LocalDate fechaFin) {
        this.animal = animal;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    // Getter & Setter

    public String getAnimal() {
        return animal;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    // toString

    @Override
    public String toString() {
        return "HoroscopoResponseDTO{" +
                "animal='" + animal + '\'' +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                '}';
    }
}
