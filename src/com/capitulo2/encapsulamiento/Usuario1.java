/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.capitulo2.encapsulamiento;

/**
 *
 * @author Alejandro
 */
public class Usuario1 {
 //regla no.1 atributos con modificador private
private int id;
private String nombre;
private String email;
//Regla no.2 agregar los metodos accesorios (getter´s)
public int getId(){
return id;
}
public String getNombre(){
return nombre;
}
public String getEmail (){
return email;
}
// Crear por cada atributo su metodo mutador setter's
public void setId(int id){ // x solo aparece dentro de este metodo solamente, es una variable local
this.id=id;
}
public void setNombre(String nombre){
this.nombre=nombre;
}
public void setEmail(String email){
this.email=email;
}
}