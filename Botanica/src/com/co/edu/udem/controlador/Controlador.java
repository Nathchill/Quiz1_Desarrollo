package com.co.edu.udem.controlador;

import com.co.edu.udem.modelo.entidad.Lechuga;
import com.co.edu.udem.modelo.entidad.Mora;
import com.co.edu.udem.modelo.entidad.Zanahoria;
import com.co.edu.udem.modelo.interfaces.Plantas;

import java.util.ArrayList;
import java.util.List;

public class Controlador {
    public static void lista(){
        List<Plantas> plantas = new ArrayList<>();
        plantas.add(new Lechuga("lechuguita","verde"));
        plantas.add(new Lechuga("lechuga2","verde claro"));
        plantas.add(new Zanahoria("zanahoria bebé","naranja"));
        plantas.add(new Mora("morita","morado"));
        System.out.printf(plantas.toString());
    }
}
