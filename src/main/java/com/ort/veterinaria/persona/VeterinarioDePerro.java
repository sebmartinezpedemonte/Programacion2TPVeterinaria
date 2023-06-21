package com.ort.veterinaria.persona;

import com.ort.veterinaria.Criterio;
import com.ort.veterinaria.estadoMascota.EstadoMascota;
import com.ort.veterinaria.mascota.Mascota;

public class VeterinarioDePerro extends Veterinario{
    public VeterinarioDePerro(String nombre, String apellido, String email, String numeroCelular, String dni) {
        super(nombre, apellido, email, numeroCelular, dni);
    }

    @Override
    public void examinarMascota(Mascota m) {
        super.agregarMascota(m);
    }

    @Override
    public void darDeComer(Mascota m) {
        EstadoMascota eM;
        m.recibirComida();
        eM = m.getEstado();
        this.actualizar(eM);
    }

    @Override
    public void darDeTomar(Mascota m) {
        this.actualizar(m.getEstado().recibirBebida());
    }

    @Override
    public void darMedicina(Mascota m) {
        this.actualizar(m.getEstado().recibirMedicina());
    }

    //TODO Falta implementar esto
    @Override
    public void atenderMascota(Mascota m) {

    }

    //TODO Falta implementar esto
    @Override
    public void aplicarCriterio(Criterio c) {

    }
}
