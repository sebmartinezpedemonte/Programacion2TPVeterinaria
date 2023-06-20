package com.ort.veterinaria.estadoMascota;

public class Enfermo extends EstadoMascota{
    @Override
    public EstadoMascota recibirComida() {
        return this;
    }

    @Override
    public EstadoMascota recibirBebida() {
        return this;
    }

    @Override
    public EstadoMascota recibirMedicina() {
        return new Feliz();
    }
}
