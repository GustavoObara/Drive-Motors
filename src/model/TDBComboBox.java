package model;

import connection.MySQL;
import javax.swing.JComboBox;

public class TDBComboBox {    
    
    MySQL db = new MySQL();
    
    public boolean setStatus(JComboBox cb,String table,String field,String orderby) {         
        try{
            db.conectaBanco();            
            String query = "select " +field+" from "+table;           
            if (orderby != null){
                query = query + " order by " + orderby;
            }
            this.db.executarSQL(query);          
            while(this.db.getResultSet().next()){
                cb.addItem(this.db.getResultSet().getString(1));              
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        } finally {
            db.fechaBanco();
        }      
        return true;
    }   
}