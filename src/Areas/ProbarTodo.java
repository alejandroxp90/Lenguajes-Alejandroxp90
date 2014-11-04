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
public class ProbarTodo {
/**
* @param args the command line arguments
*/
public static void main(String[] args) {
// TODO code application logic here
Curso curso1=new Curso();
curso1.setNombre("redes 1");
curso1.setCuatrimestre(2);
curso1.setProfesor("Rene");
Curso curso2=new Curso();
curso2.setNombre("java 2");
curso2.setCuatrimestre(4);
curso2.setProfesor("campos");
Curso curso3=new Curso();
curso3.setNombre("Sistemas Operativos");
curso3.setCuatrimestre(6);
curso3.setProfesor("Natisma");
Curso cursos[]={curso1,curso2,curso3};
Alumno a=new Alumno("Juan Carlos",cursos);
}
}