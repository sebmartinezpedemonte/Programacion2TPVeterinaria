package com.ort.veterinaria.persona;

import com.ort.veterinaria.Criterio;
import com.ort.veterinaria.mascota.Mascota;

public class VeterinarioDeConejo extends Veterinario{
    public VeterinarioDeConejo(String nombre, String apellido, String email, String numeroCelular, String dni) {
        super(nombre, apellido, email, numeroCelular, dni);
    }

    @Override
    public void examinarMascota(Mascota m) {
        super.agregarMascota(m);
    }

    @Override
    public void darDeComer(Mascota m) {

        this.update(m.getEstado());
    }

    @Override
    public void darDeTomar(Mascota m) {
        this.update(m.getEstado());
    }

    @Override
    public void darMedicina(Mascota m) {
        this.update(m.getEstado());
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
