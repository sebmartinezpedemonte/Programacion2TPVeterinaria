package com.ort.veterinaria.mascota;

import com.ort.veterinaria.estadoMascota.EstadoMascota;

public class Conejo extends Mascota{
    public Conejo(String nombre, Double peso, boolean estaVacunado, EstadoMascota estado) {
        super(nombre, peso, estaVacunado, estado);
    }
    @Override
    public void recibirComida() {
        setEstado(this.getEstado().recibirComida());
        this.notificar();
        System.out.println("Squeak");
    }

    @Override
    public void recibirBebida() {
        setEstado(this.getEstado().recibirBebida());
        this.notificar();
        System.out.println("Squeak");
    }

    @Override
    public void recibirMedicina() {
        setEstado(this.getEstado().recibirMedicina());
        this.notificar();
        System.out.println("Squeak");
    }
}
