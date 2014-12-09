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
public class Cuadrado implements Superficies {
private int lado;
public Cuadrado(int lado) {
this.lado = lado;
}

    Cuadrado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
public int calcularArea(){
int area= lado*lado;
return area;
}
public int calcularPerimetro(){
return 7;
}

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
}