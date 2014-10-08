package com.capitulo2.encapsulamiento;
/**
*
* @author campitos
*/
public class Usuario {
private String nombre;
private float sueldoBase;
private int horasTrabajadas;
public Usuario() {
}
public Usuario(String nombre, float sueloBase, int horasTrabajadas) {
this.nombre = nombre;
this.sueldoBase = sueldoBase;
this.horasTrabajadas = horasTrabajadas;
}
public int getHorasTrabajadas() {
return horasTrabajadas;
}
public void setHorasTrabajadas(int horasTrabajadas) {
this.horasTrabajadas = horasTrabajadas;
}
public String getNombre() {
return nombre;
}
public void setNombre(String nombre) {
this.nombre = nombre;
}
public float getSueldoBase() {
return sueldoBase;
}
public void setSueldoBase(float sueloBase) {
this.sueldoBase = sueldoBase;
}
}