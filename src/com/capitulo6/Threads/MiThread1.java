/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.capitulo6.Threads;

/**
 *
 * @author Alejandro
 */
public class MiThread1 implements Runnable {
/**
* @param args the command line arguments
*/
public static void main(String[] args) {
Runnable r=new MiThread1();
Thread t1=new Thread(r);
t1.start();
}
public void run(){
System.out.println("Soy un Thread");
}
}