package com.co.edu.udem.modelo.entidad;

import com.co.edu.udem.modelo.clases.Hortalizas;

public class Zanahoria extends Hortalizas {
    private String nombre;
    private String color;
    private int edad;

    public Zanahoria(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
        this.edad = 3;
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
        return "\n<zanahoria>\n" +
                "\t<nombre>" + nombre + "</nombre>\n" +
                "\t<color>" + color + "</color>\n" +
                "\t<edad>" + edad + "</color>\n" +
                "</zanahoria>";
    }
}
