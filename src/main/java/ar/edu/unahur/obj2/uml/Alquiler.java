package ar.edu.unahur.obj2.uml;

import java.util.Date;

import ar.edu.unahur.obj2.uml.Vehiculos.Vehiculo;

public class Alquiler {

    private Date fechaDeInicio ;
    private Date fechaDeFin ;
    private Usuario usuario;
    private Vehiculo vehiculo;
    public Alquiler(Date fechaDeInicio, Date fechaDeFin, Usuario usuario, Vehiculo vehiculo) {
        this.fechaDeInicio = fechaDeInicio;
        this.fechaDeFin = fechaDeFin;
        this.usuario = usuario;
        this.vehiculo = vehiculo;
    }

    public void finaliar() {
        this.vehiculo.liberar();
    }
}
