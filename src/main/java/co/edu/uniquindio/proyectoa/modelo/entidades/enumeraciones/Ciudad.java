package co.edu.uniquindio.proyectoa.modelo.entidades.enumeraciones;

import jakarta.persistence.Id;

public enum Ciudad {

    ARMENIA("Armenia"),
    PEREIRA("Pereira"),
    CALARCA("Calarcá"),
    SANTAROSA("Santa Rosa");

    private String nombre;

    Ciudad(String nombre) { this.nombre=nombre;}
}
