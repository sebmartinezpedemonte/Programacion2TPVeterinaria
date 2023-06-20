package com.ort.veterinaria.persona;

import com.ort.veterinaria.ClinicaVeterinaria;
import com.ort.veterinaria.Criterio;
import com.ort.veterinaria.estadoMascota.EstadoMascota;
import com.ort.veterinaria.mascota.Mascota;

public abstract class Veterinario extends Persona{

    private Criterio criterio;


    public Veterinario(String nombre, String apellido, String email, String numeroCelular, String dni) {
        super(nombre, apellido, email, numeroCelular, dni);
    }

    @Override
    public void update(EstadoMascota estado) {
        System.out.println("Su paciente esta " + estado.toString());
    }

    protected Criterio getCriterio() {
        return criterio;
    }

    protected void setCriterio(Criterio criterio) {
        this.criterio = criterio;
    }

    public abstract void examinarMascota(Mascota m);

    public abstract void darDeComer(Mascota m);

    public abstract void darDeTomar(Mascota m);

    public abstract void darMedicina(Mascota m);

    //TODO Falta implementar esto en las clases hijas
    public abstract void atenderMascota(Mascota m);

    //TODO Falta implementar esto en las clases hijas
    public abstract void aplicarCriterio(Criterio c);

    public void cambiarCriterio(Criterio criterio){
        this.criterio = criterio;
    }




}
