package ar.edu.unahur.obj2.uml.Vehiculos;

public abstract class Vehiculo {

    private Boolean disoponible;

    public Boolean isDisponible() {
        return disoponible;
    }

    public void ocupar() {
        this.disoponible = false;
    }

    public void liberar() {
        this.disoponible = true;
    }

}
