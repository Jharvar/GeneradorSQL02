/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utiles;

import java.util.HashMap;

/**
 *
 * @author Jharvar
 */
public class UtilesSQL {
    
    public static final String TABLE ="TABLE";
    public static final String VIEW ="VIEW";
    public static final String SYNONYM="SYNONYM";
    public static final String INDEX ="INDEX";
    public static final String TRIGGER ="TRIGGER";
    public static final String GRANT ="GRANT";
    public static final String REVOKE ="REVOKE";
    public static final String PK = "PK";
    public static final String FK ="FK";
    public static final String ROLLBACK="ROLLBACK";
    public static final String SPOOLIN[] ={"SET HEADING OFF","SET FEEDBACK OFF",
        "select 'INICIO: '||to_char(sysdate,'dd/mm/yyyy hh24:mi:ss') from dual;",
        "SET FEEDBACK ON"};
    public static final String SPOOLOUT[] ={"SET FEEDBACK OFF","select 'FIN: '||to_char(sysdate,'dd/mm/yyyy hh24:mi:ss') from dual;"
    ,"SET FEEDBACK ON","SPOOL OFF"};
    
    public static final HashMap<String,String> tipologia = getTipologias();
    
    public static HashMap<String,String> getTipologias(){
        HashMap<String,String> tipologia = new HashMap<String,String>();
        tipologia.put(TABLE, ".tab");
        tipologia.put(VIEW, ".vie");
        tipologia.put(SYNONYM, ".syn");
        tipologia.put(INDEX, ".idx");
        tipologia.put(TRIGGER,"trg");
        tipologia.put(GRANT, ".dcl");
        tipologia.put(REVOKE, ".dcl");
        tipologia.put(PK, ".pk");
        tipologia.put(FK, ".fk");
        return tipologia;
    }
}
