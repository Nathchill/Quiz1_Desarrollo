package com.co.edu.udem.modelo.entidad;

import com.co.edu.udem.modelo.clases.Hortalizas;

public class Lechuga extends Hortalizas {
    private String nombre;
    private String color;
    private int edad;

    public Lechuga(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
        this.edad = 1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "\n<lechuga>\n" +
                "\t<nombre>" + nombre + "</nombre>\n" +
                "\t<color>" + color + "</color>\n" +
                "\t<edad>" + edad + "</color>\n" +
                "</lechuga>";
    }
}
