

package reto5;

public class tutor extends usuarioFinal {
private alumno alumno;

    public tutor(alumno alumno, int id, String nombre, String apellido, String correo) {
        super(id, nombre, apellido, correo);
        this.alumno = alumno;
    }

    public alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(alumno alumno) {
        this.alumno = alumno;
    }
    public void mostrarCalificaciones(){
    System.out.println("estudiante" + alumno.nombre + " " + alumno.apellido);
    alumno.mostarCalificacion();
    }


    
}
