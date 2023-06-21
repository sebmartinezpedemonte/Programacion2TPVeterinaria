package com.ort.veterinaria.persona;

import com.ort.veterinaria.estadoMascota.EstadoMascota;

public class Duenio extends Persona{
    public Duenio(String nombre, String apellido, String email, String numeroCelular, String dni) {
        super(nombre, apellido, email, numeroCelular, dni);
    }


    @Override
    public void actualizar(EstadoMascota estado) {
        System.out.println("Su mascota esta " + estado.toString());
    }
}
