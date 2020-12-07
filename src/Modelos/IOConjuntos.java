/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

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

/**
 *
 * @author Andres Esparza
 */
public class IOConjuntos {

    public IOConjuntos() {
    }

    public Conjunto leerConjuntoJSON(File archivo) throws ExtencionDeArchivoInvalida {
        String extencionArchivo = archivo.getAbsolutePath();
        int a = extencionArchivo.indexOf(".");
        extencionArchivo = extencionArchivo.substring(a+1/*extencionArchivo.length()-4*/, extencionArchivo.length());
        System.out.println(extencionArchivo);
        if(!extencionArchivo.equals("json")){
            String message = "La extencion de archivo ["+extencionArchivo+"] \nno es valida.\nSolo se admiten archivos\ncon extencion JSON";
            System.out.println("mal");
            ExtencionDeArchivoInvalida e = new ExtencionDeArchivoInvalida(message);
            throw e;
        }
        ArrayList<String> elementos = new ArrayList();
        JSONParser jsonParser = new JSONParser();
        FileReader reader;
        try {
            reader = new FileReader(archivo);
            Object obj = jsonParser.parse(reader);
            JSONArray elementosJSON = (JSONArray) obj;
            //System.out.println(elementosJSON); // Este es el objeto JSON recuperado
            for (int i = 0; i < elementosJSON.size(); i++) {
                elementos.add(elementosJSON.get(i).toString());
            }
        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
            Logger.getLogger(IOConjuntos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(IOConjuntos.class.getName()).log(Level.SEVERE, null, ex);
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
