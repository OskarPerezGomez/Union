package Modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Juego {
    private int cod;
    private String nombre;
    private String desarrolladora;
    private LocalDate fechaLanzamiento;

    private List<Competicion> listaCompeticiones;



    // Constructores
    public Juego(int cod, String nombre, String desarrolladora, LocalDate fechaLanzamiento,List<Competicion> listaCompeticiones) {
        this.cod = cod;
        this.nombre = nombre;
        this.desarrolladora = desarrolladora;
        this.fechaLanzamiento = fechaLanzamiento;
        this.listaCompeticiones = listaCompeticiones;
    }
    public Juego() {}

    // Getters & Setters
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDesarrolladora() {
        return desarrolladora;
    }

    public void setDesarrolladora(String desarrolladora) {
        this.desarrolladora = desarrolladora;
    }

    public LocalDate getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(LocalDate fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }


}
