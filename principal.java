/*

 */

package reto5;

import java.util.Scanner;


public class principal {
    public static void main(String[] args) {
        float calif;
        Scanner entrada = new Scanner(System.in);
        maestro m1 = new maestro(1,"yadira","marquez"," yamarquez@uveg.edu.mx");
        alumno a1 = new alumno(1,"alberto","amador","aamador@mail.com");
        tutor t1 = new tutor(a1,1,"marina","de Jesus","marjesus@mail.com");
        System.out.println("datos del maestro");
        m1.imprimirPerfil();
        System.out.println("el dato del alumno");
        a1.imprimirPerfil();
        System.out.println("el tutotr es");
        t1.imprimirPerfil();
        System.out.println("la calificacion del alumno"+a1.nombre+" "+a1.apellido);
        calif = entrada.nextFloat();
        a1.guardarCalificacion(calif);
        System.out.println("tutor asignado" + "alumno"+a1.nombre+""+a1.apellido);
        t1.imprimirPerfil();
        t1.mostrarCalificaciones();
        
    }
    
}
