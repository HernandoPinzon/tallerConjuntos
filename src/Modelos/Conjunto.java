/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.util.ArrayList;

/**
 *
 * @author Andres Esparza
 */
public class Conjunto {

    private ArrayList<String> elementos = new ArrayList();

    public Conjunto(ArrayList<String> elementos) {
        this.elementos = elementos;
    }

    public ArrayList getElementos() {
        return elementos;
    }

    @Override
    public String toString() {
        String contenido = "";
        for (String elemento : elementos) {
            contenido += elemento + "\n";
        }
        return contenido;
    }
}
