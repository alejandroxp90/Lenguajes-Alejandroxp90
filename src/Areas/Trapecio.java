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
public class Trapecio implements Superficies {
private int baseMayor;
private int baseMenor;
private int altura;
public Trapecio(int baseMayor, int baseMenor, int altura) {
this.baseMayor = baseMayor;
this.baseMenor = baseMenor;
this.altura = altura;
}
@Override
public int calcularArea() {
int area=((baseMayor+baseMenor)*altura)/2;
return area;
}
public int calcularPerimetro() {
throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
}
public int getBaseMayor() {
return baseMayor;
}
public void setBaseMayor(int baseMayor) {
this.baseMayor = baseMayor;
}
public int getBaseMenor() {
return baseMenor;
}
public void setBaseMenor(int baseMenor) {
this.baseMenor = baseMenor;
}
public int getAltura() {
return altura;
}
public void setAltura(int altura) {
this.altura = altura;
}
}