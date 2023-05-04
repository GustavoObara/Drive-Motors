package db;

import entity.Automovel;
import entity.Usuario;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class MySQL {
    
    //atributos de conexão com o banco
    private Connection conn = null; //variável de conexão com o banco
    private Statement statement; //variável de manipulação do SQL
    private ResultSet resultSet;
    
    private String servidor = "localhost:3306";
    private String nomeDoBanco = "bdDriveMotors";
    private String usuario = "root";
    private String senha = "luizlui2";
    
    //Construtor    
    public MySQL(){
    
    }
    
    public MySQL(String servidor, String nomeDoBanco, String usuario, String senha){
        this.servidor = servidor;
        this.nomeDoBanco = nomeDoBanco;
        this.usuario = usuario;
        this.senha = senha;
    }
    
    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public ResultSet getResultSet() {
        return resultSet;
    }

    public void setResultSet(ResultSet resultSet) {
        this.resultSet = resultSet;
    }
        
    public void conectaBanco(){
        try {
            //Class.forName("com.mysql.jdbc.Driver").newInstance();;

            String strCon = "jdbc:mysql://" + servidor + "/" + nomeDoBanco+"?zeroDateTimeBehavior=CONVERT_TO_NULL&useTimezone=true&serverTimezone=UTC";
            conn = DriverManager.getConnection(strCon,usuario,senha);
            
            if(conn != null){
                System.out.println("Conexão efetuada com sucesso! " + "ID: " + conn);
            }            
            
        } catch (Exception e) {
            System.out.println("Conexão não realizada - ERRO: " + e.getMessage());
        }
    }
    
    public boolean fechaBanco(){
        try {
            conn.close();
            return true;
        } catch (Exception e) {
            System.out.println("Erro ao fechar conexao " + e.getMessage());
            return false;
        }
    }
    
    public int insertSQL(String SQL){
        int status = 0;
        try {
            //createStatement de con para criar o Statement
            this.setStatement(getConn().createStatement());            

            // Definido o Statement, executamos a query no banco de dados
            status = this.getStatement().executeUpdate(SQL);            
            System.out.println(status);
            return status;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return status;
        }
    }
    
    public void executarSQL(String sql) {
        try {
            this.statement = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            this.resultSet = this.statement.executeQuery(sql);

        } catch (SQLException sqlex) {
            sqlex.printStackTrace();
        }
    }
    
    public boolean updateSQL(String pSQL){
        int status = 0;
        try {            
            //createStatement de con para criar o Statement
            this.setStatement(getConn().createStatement());

            // Definido o Statement, executamos a query no banco de dados
            status = getStatement().executeUpdate(pSQL);
            System.out.println(status);
            if (status == 0) {
                return false;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
        return true;
    }
    
    public boolean RegisterUser(Usuario user){                
        try {
            String query ="INSERT INTO usuario "
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
    }

    public boolean RegisterAuto(Automovel novo_auto){
        try {
            String query = "INSERT INTO automovel VALUES ("
                + "'" + novo_auto.getMarca() + "',"
                + "'" + novo_auto.getModelo() + "',"
                + "'" + novo_auto.getCambio() + "',"
                + "'" + novo_auto.getAno() + "',"
                + "'" + novo_auto.getCombustivel() + "',"
                + "'" + novo_auto.getCor() + "',"
                + "'" + novo_auto.getPlaca() + "',"
                + "'" + novo_auto.getRenavam() + "',"
                + "'" + novo_auto.getQuilometragem() + "',"
                + "'" + novo_auto.getValor() + "',"
                + "'" + novo_auto.getObservacao() + "',"
                        
                + "" + novo_auto.isAlarme() + ","
                + "" + novo_auto.isFreio() + ","
                + "" + novo_auto.isAr() + ","
                + "" + novo_auto.isVidro() + ","
                + "" + novo_auto.isDirecao() + ","
                + "" + novo_auto.isRodas() + ","
                + "" + novo_auto.isRetrovisor() + ","
                + "" + novo_auto.isMultimidia() + ");";
            insertSQL(query);
            return true;
        } catch (Exception e) {
            return false;
        } 
    }
    
    
    
}

