/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Klassen;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author markusschaefer
 */
public class Gast {
    //Ein Gast hat einen Namen
    private String name;
    //Ein Gast braucht ein Bettchen
    private int bett;
    
    //Gäste müssen gebaut werden

    public Gast(String name, int bett) throws GastExceptions{
        this.name = name;
        this.bett = bett;
        
        //Ein Gast ohen Bett ist kein Gast
        if (bett<=0){
            throw new GastExceptions("Ein Gast braucht mindestens ein Bett.");
            
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBett() {
        return bett;
    }

    public void setBett(int bett) {
        this.bett = bett;
    }
    
    public static void test(){
        try {
            Gast g = new Gast("a",2);
            System.out.println(g);
        } catch (GastExceptions ex) {
            Logger.getLogger(Gast.class.getName()).log(Level.SEVERE, null, ex);
        }
        
                
    }

    @Override
    public String toString() {
        return name + " - " + bett;
    }
    
    
}
