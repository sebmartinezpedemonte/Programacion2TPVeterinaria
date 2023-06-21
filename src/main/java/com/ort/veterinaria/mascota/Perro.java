package com.ort.veterinaria.mascota;

import com.ort.veterinaria.estadoMascota.EstadoMascota;

public class Perro extends Mascota{
    public Perro(String nombre, Double peso, boolean estaVacunado, EstadoMascota estado) {
        super(nombre, peso, estaVacunado, estado);
    }

    @Override
    public void recibirComida() {
        setEstado(this.getEstado().recibirComida());
        System.out.println("Woof woof");
    }

    @Override
    public void recibirBebida() {
        setEstado(this.getEstado().recibirBebida());
        System.out.println("Woof woof");
    }

    @Override
    public void recibirMedicina() {
        setEstado(this.getEstado().recibirMedicina());
        System.out.println("Woof woof");
    }
}
