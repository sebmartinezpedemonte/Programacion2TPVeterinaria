package com.ort.veterinaria.estadoMascota;

public class Sediento extends EstadoMascota{
    @Override
    public EstadoMascota recibirComida() {
        return this;
    }

    @Override
    public EstadoMascota recibirBebida() {
        return new Feliz();
    }

    @Override
    public EstadoMascota recibirMedicina() {
        return this;
    }
}
