package mx.unam.aragon.inicio;

import mx.unam.aragon.modelo.Calificar;
import mx.unam.aragon.modelo.Responsabilidad;
import mx.unam.aragon.modelo.Profesor;
import mx.unam.aragon.modelo.ExplicarClases;
import mx.unam.aragon.modelo.Reportes;

public class MetodoTres {
    public static void main(String[] args) {
        Profesor profesor = new Profesor();
        profesor.setNombre("Juan");
        ExplicarClases explicar = new ExplicarClases();
        Calificar calificar = new Calificar();
        Reportes reportes = new Reportes();
        profesor.getResponsabilidad().add(explicar);
        profesor.getResponsabilidad().add(calificar);
        profesor.getResponsabilidad().add(reportes);
        System.out.println(profesor.getNombre());
        for (Responsabilidad responsabilidad : profesor.getResponsabilidad()) {
            System.out.println("--");
            responsabilidad.realizar();
        }
    }
}
