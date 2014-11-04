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
public class ProbarAreas {
/**
* @param args the command line arguments
*/
public static void main(String[] args) {
//primero creamos un cuadrado
Cuadrado d=new Cuadrado();
d.setLado(6);
//el sig obejto es el area
Area a=new Area(d);
System.out.println (a.calcular());
}
}