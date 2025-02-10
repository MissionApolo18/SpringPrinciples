package mx.unam.aragon.modelo;

import java.util.ArrayList;

public class Profesor {
    private String nombre;
    private ArrayList<Responsabilidad> responsabilidad=new ArrayList<>();

    public Profesor() {
        //responsabilidad = new Responsabilidades();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Responsabilidad> getResponsabilidad() {
        return responsabilidad;
    }

    public void setResponsabilidad(ArrayList<Responsabilidad> responsabilidad) {
        this.responsabilidad = responsabilidad;
    }
}
