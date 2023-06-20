package com.ort.veterinaria.persona;

import com.ort.veterinaria.estadoMascota.EstadoMascota;
import com.ort.veterinaria.mascota.Mascota;

import java.util.ArrayList;

public abstract class Persona {

    private String nombre;
    private String apellido;
    private String email;
    private String numeroCelular;
    private String dni;
    private ArrayList<Mascota> mascotas;

    public Persona(String nombre, String apellido, String email, String numeroCelular, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.numeroCelular = numeroCelular;
        this.dni = dni;
        this.mascotas = new ArrayList<>();
    }





    public abstract void update(EstadoMascota estado);
    //creo que este recibe el EstadoMascota en su update
    //como parametro que recibe de notificar


}
