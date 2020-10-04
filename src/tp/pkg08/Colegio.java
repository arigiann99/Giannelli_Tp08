
package tp.pkg08;


public class Colegio {

    
    public static void main(String[] args) {
        
        Materia ingles = new Materia(5,"Ingles 1",2020);
        Materia matematicas = new Materia(6,"Matematicas 1",2020);
        Materia laboratorio = new Materia(7,"Laboratorio 1",2020);
        
        Alumno lopez = new Alumno(1001,"Lopez","Martin");
        Alumno martinez = new Alumno(1002,"Martinez","Brenda");
        
        lopez.agregarMateria(ingles);
        lopez.agregarMateria(matematicas);
        lopez.agregarMateria(laboratorio);
        
        martinez.agregarMateria(ingles);
        martinez.agregarMateria(matematicas);
        martinez.agregarMateria(laboratorio);
        martinez.agregarMateria(laboratorio);
        
        System.out.println(lopez.cantidadMaterias());
        System.out.println(martinez.cantidadMaterias());
        
        //Respuestas:
        //e)-a Ambos tienen la misma cantidad de materias porque se utilizo una coleccion
        //tipo "HashSet" que no admite duplicados.
        
        //e)-b Para este caso en particular me parecio muy util la coleccion de tipo Set-HashSet
        //no realize modificaciones generales por esta coleccion posee ventajas muy utiles para 
        //escribir y leer datos, ademas de los no dulicados.
        
    }
    
}
