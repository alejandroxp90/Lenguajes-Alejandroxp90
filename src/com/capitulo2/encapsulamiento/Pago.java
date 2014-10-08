package com.capitulo2.encapsulamiento;
/**
*
* Alejandro Juarez
*/
public class Pago {
     public float hacerPago(Usuario u){
        float pago=u.getHorasTrabajadas()*u.getSueldoBase();
        System.out.println("Quincena pagada a:"+u.getNombre() +", por la cantidad mensual de : "+pago);
        return pago;
}
}