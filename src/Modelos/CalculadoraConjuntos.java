/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import Excepciones.ArchivoJSONInvalido;
import Excepciones.ExtencionDeArchivoInvalida;
import Excepciones.OperacionInvalida;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Andres Esparza
 */
public class CalculadoraConjuntos {

    IOConjuntos ioConjuntos;
    private Conjunto conjuntoA;
    private Conjunto conjuntoB;
    private Conjunto conjuntoC;

    public CalculadoraConjuntos() {
        ioConjuntos = new IOConjuntos();
    }

    public void realizarUnion() throws OperacionInvalida {
        if (conjuntoA!=null&&conjuntoB!=null) {
            ArrayList<String> elementosA = conjuntoA.getElementos();
            ArrayList<String> elementosB = conjuntoB.getElementos();
            ArrayList<String> resultado = new ArrayList();
        
            for (String string : elementosA) {
                resultado.add(string);
            }
            for (String string : elementosB) {
                resultado.add(string);
            }
            
            conjuntoC = new Conjunto(resultado);
        } else {
            throwOperacionInvalida();
        }  
    }
    
    public void realizarInterseccion() throws OperacionInvalida{
        if (conjuntoA!=null&&conjuntoB!=null) {
            ArrayList<String> elementosA = conjuntoA.getElementos();
            ArrayList<String> elementosB = conjuntoB.getElementos();
            ArrayList<String> resultado = new ArrayList();
        
            for (String string : elementosA) {
                boolean esIgual=false;
                for (String string2 : elementosB) {
                    if(string.equals(string2)&&!esIgual){
                        esIgual=true;
                    } 
                }
                if (esIgual) {
                    resultado.add(string);
                }
            }
            conjuntoC = new Conjunto(resultado);
        } else {
            throwOperacionInvalida();
        }
    }

    public void realizarDiferencia() throws OperacionInvalida {
        if (conjuntoA != null && conjuntoB != null) {
            ArrayList<String> elementosA = conjuntoA.getElementos();
            ArrayList<String> elementosB = conjuntoB.getElementos();
            ArrayList<String> resultado = new ArrayList();
            
            diferenciaDeArrayList(elementosA, elementosB, resultado);
            conjuntoC = new Conjunto(resultado);
        } else {
            throwOperacionInvalida();
        }
    }
    
    public void realizarDiferenciaSimetrica() throws OperacionInvalida{
        if (conjuntoA != null && conjuntoB != null) {
            ArrayList<String> elementosA = conjuntoA.getElementos();
            ArrayList<String> elementosB = conjuntoB.getElementos();
            ArrayList<String> resultado = new ArrayList();
            
            diferenciaDeArrayList(elementosA, elementosB, resultado);
            diferenciaDeArrayList(elementosB, elementosA, resultado);
            conjuntoC = new Conjunto(resultado);
        } else {
            throwOperacionInvalida();
        }
    }

    public void diferenciaDeArrayList(
            ArrayList<String> elementosA,
            ArrayList<String> elementosB,
            ArrayList<String> resultado) {
        for (String string : elementosA) {
            boolean esDiferente = true;
            for (String string2 : elementosB) {

                if (string.equals(string2) && esDiferente) {
                    esDiferente = false;
                }
            }
            if (esDiferente) {
                resultado.add(string);
            }
        }
    }
    
    private void throwOperacionInvalida() throws OperacionInvalida{
        String message="";
        if(conjuntoA==null&&conjuntoB!=null){
            message = "El conjunto 1 no ha sido \nseleccionado";
        } else if (conjuntoB==null&&conjuntoA!=null){
            message = "El conjunto 2 no ha sido \nseleccionado";
        } else{
            message = "Ningun conjunto ha sido \nseleccionado";
        }
        OperacionInvalida e=new OperacionInvalida(message);
        throw e;
    }

    public void crearResultado(File archivo) throws IOException{
        if (conjuntoC!=null)
        ioConjuntos.escribirConjunto(archivo, conjuntoC);
    }

    /**
     * @param conjuntoA the conjuntoA to set
     */
    public void setConjuntoA(File archivo) throws FileNotFoundException, ExtencionDeArchivoInvalida, ArchivoJSONInvalido {

        this.conjuntoA = ioConjuntos.leerConjuntoJSON(archivo);;
    }

    /**
     * @param conjuntoB the conjuntoB to set
     */
    public void setConjuntoB(File archivo) throws FileNotFoundException, ExtencionDeArchivoInvalida, ArchivoJSONInvalido {

        this.conjuntoB = ioConjuntos.leerConjuntoJSON(archivo);;
    }

    /**
     * @return the conjuntoA
     */
    public String getConjuntoAString() {
        return conjuntoA.toString();
    }

    /**
     * @return the conjuntoB
     */
    public String getConjuntoBString() {
        return conjuntoB.toString();
    }

    /**
     * @return the conjuntoC
     */
    public String getConjuntoCString() {
        return conjuntoC.toString();
    }
}
