/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Klassen;

import java.util.ArrayList;

/**
 *
 * @author markusschaefer
 */
public class Buchungsliste extends ArrayList<Gast> {

    public Buchungsliste() {
    }

    @Override
    public String toString() {
        String ausgabeString = "";

        for (Gast gast : this) {
            ausgabeString += gast + "\n";
        }

        return ausgabeString;

    }

    public static void test() {
        Buchungsliste a = new Buchungsliste();
        a.add(new Gast("a", 1));
        a.add(new Gast("b", 2));
        System.out.println(a);
    }

}
