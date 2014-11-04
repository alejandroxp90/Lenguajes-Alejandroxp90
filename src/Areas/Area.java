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
public class Area {
 Superficies s;
public Area(Superficies s){
this.s=s;
}
public int calcular(){
int area=s.calcularArea();
return area;
}
}