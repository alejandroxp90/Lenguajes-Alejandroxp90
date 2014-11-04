/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Areas;

/**
 *
 * @author Alejandro
 */
public class Alumno {
private String nombreAlumno;
private Curso []cursos;
public Alumno(){
}
public Alumno(String nombreAlumno, Curso[] cursos) {
this.nombreAlumno = nombreAlumno;
this.cursos = cursos;
}
public String getNombreAlumno() {
return nombreAlumno;
}
public void setNombreAlumno(String nombreAlumno) {
this.nombreAlumno = nombreAlumno;
}
public Curso[] getCursos() {
return cursos;
}
public void setCursos(Curso[] cursos) {
this.cursos = cursos;
}
}