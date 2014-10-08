package com.capitulo3.constructores;



public class Pelicula {
private String Titulo;
private int Duracion;
public Pelicula() {
}
public Pelicula(String Titulo, int Duracion) {
this.Titulo = Titulo;
this.Duracion = Duracion;
}
public String getTitulo() {
return Titulo;
}
public void setTitulo(String Titulo) {
this.Titulo = Titulo;
}
public int getDuracion() {
return Duracion;
}
public void setDuracion(int Duracion) {
this.Duracion = Duracion;
}
}
