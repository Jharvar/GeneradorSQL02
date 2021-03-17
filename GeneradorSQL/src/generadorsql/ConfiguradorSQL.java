/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generadorsql;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jharvar
 */
public class ConfiguradorSQL {
    
    private String ruta;
   
    public ConfiguradorSQL(){
        try {
            ruta = recogerRuta();
        } catch (IOException ex) {
            Logger.getLogger(ConfiguradorSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Metodo que recoge la ruta por defecto
     * @return ruta
     */
    public String recogerRuta()throws FileNotFoundException,IOException{
        String rutaEncontrada =".\\";
        File fichero = new File(rutaEncontrada);       
        return buscarRuta(fichero);
    }
    
    /**
     * Metodo que busca la ruta en el fichero de configuración y la almacena
     * en una variable.
     * @param fichero File
     * @return ruta del fichero 
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public String buscarRuta(File fichero) throws FileNotFoundException, IOException{
            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);
            String[] partes= new String[2];
            String lectura = br.readLine();
            while(lectura!= null){
                if(lectura.equals("RUTA")) partes = lectura.split("=");
            }
            br.close();
            fr.close();
            return partes[1];
    }
   
    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
}
