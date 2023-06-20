package com.ort.veterinaria.estadoMascota;

public class Hambriento extends EstadoMascota{
    @Override
    public EstadoMascota recibirComida() {
        return new Feliz();
    }

    @Override
    public EstadoMascota recibirBebida() {
        return this;
    }

    @Override
    public EstadoMascota recibirMedicina() {
        return this;
    }
}
