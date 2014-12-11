/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.capitulo6.Threads;
import java.util.Calendar;
/**
 *
 * @author Alejandro
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Thread t1=new Thread(new Runnable(){
        public void run(){
            while(true){
                 try{
                  Thread.sleep(3000);
                  System.out.println("Soy un thread");
}catch(InterruptedException e){}
}
}
});
          
          //Segundo Thread

Thread t2=new Thread(new Runnable(){
      public void run(){
      while(true){
          try{
          Thread.sleep(1000);
          Calendar c= Calendar.getInstance();
              int hora = c.get(Calendar.HOUR);
              int min = c.get(Calendar.MINUTE);
              int seg = c.get(Calendar.SECOND);
              System.out.println(hora+":"+min+":"+seg);
}catch(InterruptedException e){}
}
}
});
    t1.start();
    t2.start();
}
}
    
    

