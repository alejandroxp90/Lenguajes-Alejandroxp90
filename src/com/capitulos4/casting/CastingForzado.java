package com.capitulos4.casting;

/**
 *
 * Alejandro Juarez
 */
public class CastingForzado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        byte m = 2;
        short n = 2;
        int o = 2;
        long p = 2;
        
        p = (int)o;
        m =(byte)o;
        p = m;
        n = (short)p;
        p = o;
        o = n;
        o = (int)p;
        n = n;
        n = (byte)o;
        o = m;
        
               System.out.println(m);   
               System.out.println(n); 
               System.out.println(o); 
               System.out.println(p);  
        
    }
    
}
