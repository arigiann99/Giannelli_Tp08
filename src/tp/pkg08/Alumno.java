
package tp.pkg08;

import java.util.*;


public class Alumno {
    private int legajo;
    private String apellido;
    private String nombre;
    private Set<Materia> materias = new HashSet<>(); // Collection Tipo HashSet no admite duplicados

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
      
    public void agregarMateria(Materia m){
        if(materias.contains(m)){
            System.out.println("El alumno "+ apellido +" "+ nombre +" ya se encuentra inscripto a "+ m.getNombre());
        } else {
            materias.add(m);
        }
    }
       
    public int cantidadMaterias(){
        System.out.print(apellido+" "+nombre+" cantidad de materias inscripto: ");
        return materias.size();
    }
    
}
