package model;

import connection.MySQL;
import javax.swing.JComboBox;
import javax.swing.JList;

public class TDBList {    
    MySQL db = new MySQL();
    
    public boolean setStatus(JList cb,String table,String field,String orderby) {      
        
        try {
            db.conectaBanco();
            
            String query = "select " +field+" from "+table;
            
            if (orderby != null){
                query = query + " order by " + orderby;
            }
            
            this.db.executarSQL(query);
            
            while(this.db.getResultSet().next()){
                cb.setSelectedValue(this.db.getResultSet().getString(1),true);              
            }
            
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            db.fechaBanco();
        }
        
        return true;
    }
    
}
