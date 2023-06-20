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
    //TODO Originalmente abstracta
    public void examinarMascota(Mascota m){

    }

    //TODO Originalmente abstracta
    public void darDeComer(Mascota m){
        m.recibirComida();
    }
    //TODO Originalmente abstracta
    public void darDeTomar(Mascota m){
        m.recibirBebida();
    }
    //TODO Originalmente abstracta
    public void darMedicina(Mascota m){
        m.recibirMedicina();
    }
    //TODO Originalmente abstracta
    public void atenderMascota(Mascota m){

    }

    //TODO Originalmente abstracta
    public void aplicarCriterio(Criterio c){

    }

    public void cambiarCriterio(Criterio criterio){
        this.criterio = criterio;
    }




}
