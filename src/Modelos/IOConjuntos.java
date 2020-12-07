/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import Excepciones.ArchivoJSONInvalido;
import Excepciones.ExtencionDeArchivoInvalida;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author Andres Esparza
 */
public class IOConjuntos {

    public IOConjuntos() {
    }

    public Conjunto leerConjuntoJSON(File archivo)
            throws ExtencionDeArchivoInvalida, ArchivoJSONInvalido
    {
        String extencionArchivo = archivo.getAbsolutePath();
        int a = extencionArchivo.indexOf(".");
        extencionArchivo = extencionArchivo.substring(a + 1/*extencionArchivo.length()-4*/, extencionArchivo.length());
        System.out.println(extencionArchivo);
        if (!extencionArchivo.equals("json")) {
            String message = "La extencion de archivo [" + extencionArchivo + "] \nno es valida.\nSolo se admiten archivos\ncon extencion JSON";
            System.out.println("mal");
            ExtencionDeArchivoInvalida e = new ExtencionDeArchivoInvalida(message);
            throw e;
        }
        ArrayList<String> elementos = new ArrayList();
        JSONParser jsonParser = new JSONParser();
        FileReader reader;
        JSONArray elementosJSON = null;
        try {
            reader = new FileReader(archivo);
            Object obj = jsonParser.parse(reader);
            elementosJSON = (JSONArray) obj;//excepcion de casteo
            for (int i = 0; i < elementosJSON.size(); i++) {
                elementos.add(elementosJSON.get(i).toString());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("no se encontro el archivo");
        } catch (IOException ex) {
            System.out.println("io exception");
        } catch (ParseException ex) {
            System.out.println("JSONparser exception");
        } catch (ClassCastException ex){
            ArchivoJSONInvalido e = new ArchivoJSONInvalido("\"El archivoo JSON \nseleccionado no es un \nconjunto con una lista de \nelementos");
            throw e;
        }

        for (int i = 0; i < elementosJSON.size(); i++) {
            try {
                JSONObject b = (JSONObject) elementosJSON.get(i);
                ArchivoJSONInvalido e = new ArchivoJSONInvalido("Este archivo JSON contiene\nObjetos no elementos de un \nconjunto");
                throw e;
            } catch (ClassCastException ex) {
                try {
                    JSONArray b = (JSONArray) elementosJSON.get(i);
                    ArchivoJSONInvalido e = new ArchivoJSONInvalido("Este archivo JSON contiene\nArreglos no elementos de un \nconjunto");
                    throw e;
                } catch (ClassCastException ez){
                    System.out.println("todo ok");
                }
            }
            
        }
        return new Conjunto(elementos);
    }

    public void escribirConjunto(File archivo, Conjunto c) throws IOException {
        ArrayList<String> elementos = c.getElementos();
        
        JSONArray elementosJSON = new JSONArray();
        String string = "";
        for (String e : elementos) {
            elementosJSON.add(e);
        }
        FileWriter file = new FileWriter(archivo.getAbsoluteFile() + ".json");
        file.write(elementosJSON.toJSONString());
        file.flush();
    }
}
