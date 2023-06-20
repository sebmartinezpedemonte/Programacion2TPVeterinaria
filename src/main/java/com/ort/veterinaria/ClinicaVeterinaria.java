package com.ort.veterinaria;

import com.ort.veterinaria.mascota.Mascota;
import com.ort.veterinaria.persona.Veterinario;

import java.util.ArrayList;

public class ClinicaVeterinaria {

    private String nombre;
    private ArrayList<Veterinario> veterinarios;
    private ArrayList<Mascota> mascotas;

    public ClinicaVeterinaria(String nombre) {
        this.nombre = nombre;
        this.mascotas = new ArrayList<>();
        this.veterinarios = new ArrayList<>();
    }

    public void agregarVeterinario(Veterinario vet){
        this.veterinarios.add(vet);
    }

    public void quitarVeterinario(Veterinario vet){
        this.veterinarios.remove(vet);
    }

    public void agregarMascota(Mascota mascota){
        this.mascotas.add(mascota);
    }
    public void quitarMascota(Mascota mascota){
        this.mascotas.remove(mascota);
    }
    //TODO
    //public Factura facturarServicios(){}
}
