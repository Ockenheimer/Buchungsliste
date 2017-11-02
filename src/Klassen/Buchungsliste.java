/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Klassen;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author markusschaefer
 */
public class Buchungsliste extends ArrayList<Gast> {

    public Buchungsliste() {
    }

    //Die Gäste zeilenweise ausgeben
    @Override
    public String toString() {
        String ausgabeString = "";

        for (Gast gast : this) {
            ausgabeString += gast + "\n";
        }

        return ausgabeString;

    }

    public static void test() {
        try {
            Buchungsliste a = new Buchungsliste();
            a.add(new Gast("a", 1));
            a.add(new Gast("b", 2));
            //dritter Nutzer
            a.add(new Gast("c", 3));
            System.out.println(a);
        } catch (GastExceptions ex) {
            System.out.println(ex);
        }

    }

}
