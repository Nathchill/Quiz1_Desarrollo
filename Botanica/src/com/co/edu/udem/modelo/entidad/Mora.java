package com.co.edu.udem.modelo.entidad;

import com.co.edu.udem.modelo.clases.Frutas;

public class Mora extends Frutas {
    private String nombre;
    private String color;
    private int edad;

    public Mora(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
        this.edad = 6;
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
        return "\n<mora>\n" +
                "\t<nombre>" + nombre + "</nombre>\n" +
                "\t<color>" + color + "</color>\n" +
                "\t<edad>" + edad + "</color>\n" +
                "</mora>";
    }

}
