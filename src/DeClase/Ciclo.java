/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DeClase;

/**
 *
 * @author Alejandro
 */
public class Ciclo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 // TODO code application logic here
int []x=new int[3];
int y[]={-20,13,12};
System.out.println(y[2]);
/*
for(int i=0;i<3;i++){
System.out.println(y[i]);
}*/
/*for malo
for(int i=0;i<y.length;i++){
System.out.println(y[i]);
}*/
for(int z:y){
System.out.println(z);
}
}
}