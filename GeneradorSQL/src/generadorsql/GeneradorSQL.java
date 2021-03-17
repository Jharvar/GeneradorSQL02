/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generadorsql;

import Utiles.UtilesSQL;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jharvar
 */
public class GeneradorSQL extends UtilesSQL {
    //OT,T,D
    private String tipoTicket;
    //Identificador
    private String idTicket;
    //NºScript
    private String nScript;
    //Esquema
    private String bbddSchema;
    //table
    private String nTable;
    //tipologia
    private String tipologia;
    
    private ConfiguradorSQL cSQL;
    public GeneradorSQL(){
        this.cSQL=new ConfiguradorSQL();
    }
    
    public GeneradorSQL(String tipoTicket, String idTicket,String nScript,
            String bbddSchema,String nTable, String tipologia){
        this.tipoTicket = tipoTicket;
        this.idTicket = idTicket;
        this.nScript = nScript;
        this.bbddSchema = bbddSchema;
        this.nTable = nTable;
        this.tipologia = tipologia;
        this.cSQL=new ConfiguradorSQL();
    }

    public String getTipoTicket() {
        return tipoTicket;
    }

    public void setTipoTicket(String tipoTicket) {
        this.tipoTicket = tipoTicket;
    }

    public String getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(String idTicket) {
        this.idTicket = idTicket;
    }

    public String getnScript() {
        return nScript;
    }

    public void setnScript(String nScript) {
        this.nScript = nScript;
    }

    public String getBbddSchema() {
        return bbddSchema;
    }

    public void setBbddSchema(String bbddSchema) {
        this.bbddSchema = bbddSchema;
    }

    public String getnTable() {
        return nTable;
    }

    public void setnTable(String nTable) {
        this.nTable = nTable;
    }

    public String getTipologia() {
        return tipologia;
    }

    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }
    /**
     * Metodo que construye el nombre del Script
     * @param tipoTicket
     * @param idTicket
     * @param nScript
     * @param bbddSchema
     * @param nTable
     * @param tipologia
     * @return cadenaConstruida
     *          StringBuffer
     */
    public StringBuffer getConstruirNombreScript(String tipoTicket, String idTicket,String nScript,
            String bbddSchema,String nTable, String tipologia){
        return new StringBuffer().append(tipoTicket).append("_").append(idTicket).append("_").append("00")
                .append(nScript).append("_").append(bbddSchema).append(".").append(nTable)
                .append(tipologia);
    }
    
  /**
   * Metodo que construye el Script de Base de Datos
   * @param tipoTicket
   *        String
   * @param idTicket
   *        String
   * @param nScript 
   *        String
   * @param bbddSchema
   *        String
   * @param nTable
   *        String
   * @param tipologia
   *        String
   * @return true or false
   *         boolean
   */
    public boolean construirScript(String tipoTicket, String idTicket,String nScript,
            String bbddSchema,String nTable, String tipologia){
        String titulo = this.getConstruirNombreScript(tipoTicket, idTicket, 
                        nScript, bbddSchema, nTable, tipologia).toString();
        System.out.println(titulo);
        return crearScript(titulo);
    }
    /**
     * Metodo que crea el fichero del script mediante la clase File
     * @param titulo
     *          String
     * @return true or false
     *          boolean
     */
    public boolean crearScript(String titulo){
        try {
            File newFile = new File(titulo);
            
            if(!newFile.exists()){
                newFile.createNewFile();
                return escribirScript(newFile);
            }
        } catch (IOException ex) {
            Logger.getLogger(GeneradorSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    /**
     * Metodo que abre el fichero y lo llena
     * si el fichero no existe.
     * @param fichero
     *          File
     * @return true or false
     *          boolean
     * @throws IOException 
     */
    public boolean escribirScript(File fichero) throws IOException{
        FileWriter fw = new FileWriter(fichero);
        for(int i=0; i < SPOOLIN.length; i++){
            fw.write(SPOOLIN[i]);
            fw.write("\n");
        }
        fw.write("\n");
        fw.write("\n");
        fw.write("// TODO add your handling code here:");
        fw.write("\n");
        fw.write("\n");
        for(int j=0; j < SPOOLOUT.length; j++){
            fw.write(SPOOLOUT[j]);
            fw.write("\n");
        }
        fw.close();
        return fichero.exists() ? true : false;
    }
}
