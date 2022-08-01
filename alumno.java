
package reto5;

public class alumno extends usuarioFinal {
    private float calificacion;

    public alumno(int id, String nombre, String apellido, String correo) {
        super(id, nombre, apellido, correo);
    }
    
    public float guardarCalificacion(float calificacion){
        this.calificacion = calificacion;
        return calificacion;
    }
    
    public void mostarCalificacion(){
    System.out.println("tu calificacion es" + calificacion);
    }
}
