package com.ort.veterinaria.estadoMascota;

public class Feliz extends EstadoMascota{
    @Override
    public EstadoMascota recibirComida() {
        return new Enfermo();
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
