package com.capitulo1.abstraccion;
import com.capitulo1.abstraccion.*;
import com.capitulo2.encapsulamiento.Usuario;
import com.capitulo2.encapsulamiento.Pago;
/**
*
* Alejandro Juarez
*/
public class SistemaDePago {
        public static void main(String args[]){
        System.out.println(hacerPago(40,200));
}
            public static float hacerPago(int horas, float sueldo){
        float pago=horas*sueldo;
return pago;
}
}