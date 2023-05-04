
package db;

import entity.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author gusta
 */
public class UsuarioSQL {
    
    public MySQL mysqldb = new MySQL();
    
        public int insertSQL(String SQL){
        int status = 0;
        try {
            //createStatement de con para criar o Statement
            mysqldb.setStatement(mysqldb.getConn().createStatement());            

            // Definido o Statement, executamos a query no banco de dados
            status = mysqldb.getStatement().executeUpdate(SQL);            
            System.out.println(status);
            return status;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return status;
        } finally {
            mysqldb.fechaBanco();
        }
    }
    
    public void executarSQL(String sql) {
        mysqldb.conectaBanco();
        try {
            mysqldb.setStatement(mysqldb.getConn().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY));
            mysqldb.setResultSet(mysqldb.getStatement().executeQuery(sql));

        } catch (SQLException sqlex) {
            sqlex.printStackTrace();
        } finally {
            mysqldb.fechaBanco();
        }
    }
    
    public boolean updateSQL(String pSQL){
        mysqldb.conectaBanco();
        int status = 0;
        try {            
            //createStatement de con para criar o Statement
            mysqldb.setStatement(mysqldb.getConn().createStatement());

            // Definido o Statement, executamos a query no banco de dados
            status = mysqldb.getStatement().executeUpdate(pSQL);
            System.out.println(status);
            if (status == 0) {
                return false;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        } finally {
            mysqldb.fechaBanco();
        }
        return true;
    }
    
    public boolean RegisterUser(Usuario user){       
        mysqldb.conectaBanco();
        try {
            String query = 
                 "INSERT INTO usuario "
                +"(nm_login,senha,nm_user)"
                +"VALUES('" 
                + user.getLogin() + "','" 
                + user.getPassword() + "',' "
                + user.getName() + "')";
            insertSQL(query);
            return true;
        } catch (Exception e) {
            return false;
        } 
        finally{
            mysqldb.fechaBanco();
        }
    } 
}


