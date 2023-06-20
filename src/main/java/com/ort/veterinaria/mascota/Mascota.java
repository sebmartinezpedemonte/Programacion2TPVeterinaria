package com.ort.veterinaria.mascota;

import com.ort.veterinaria.Criterio;
import com.ort.veterinaria.persona.Persona;
import com.ort.veterinaria.estadoMascota.EstadoMascota;
import java.util.ArrayList;


public abstract class Mascota {
    private String nombre;
    private Double peso;
    private boolean estaVacunado;
    private EstadoMascota estado;
    private ArrayList<Persona> suscriptores;
    private ArrayList<Criterio> criterios;


    public Mascota(String nombre, Double peso, boolean estaVacunado, EstadoMascota estado) {
        this.nombre = nombre;
        this.peso = peso;
        this.estaVacunado = estaVacunado;
        this.estado = estado;
        this.suscriptores = new ArrayList<>();
        this.criterios = new ArrayList<>();
    }


    public abstract void recibirComida();

    public abstract void recibirBebida();

    public abstract void recibirMedicina();

    protected void setEstado(EstadoMascota estado){
        this.estado = estado;
    }



    public EstadoMascota getEstado() {
        return estado;
    }

    public void agregarSuscriptor(Persona persona){
        this.suscriptores.add(persona);
    }

    public void quitarSuscriptor(Persona persona){
        this.suscriptores.remove(persona);
    }

    //Este metodo se llama en recibir comida, bebida y recibirMedicina
    public void notificar(){
        for(Persona p : this.suscriptores){
          p.update(this.estado);
        }
    }

}
