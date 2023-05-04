package entity;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Usuario {
    
    private String login = null;
    private String password = null;
    private String name = null;
    
    
    public static char[] hexCodes(byte[] text) {
        char[] hexOutput = new char[text.length * 2];
        String hexString;

        for (int i = 0; i < text.length; i++) {
            hexString = "00" + Integer.toHexString(text[i]);
            hexString.toUpperCase().getChars(hexString.length() - 2,
                                    hexString.length(), hexOutput, i * 2);
        }
        return hexOutput;
    }
    
    public String setCriptografia(String new_pass) throws NoSuchAlgorithmException{
        MessageDigest md = MessageDigest.getInstance("MD5");
        String pass = new String(hexCodes(md.digest(new String(new_pass).getBytes())));
        
        return pass;
    }
    
    public String getLogin(){
        return this.login;
    }
    
    public void setLogin(String newValue){
        this.login = newValue;
    }
    
    public String getPassword(){
        return this.password;
    }
    
    public void setPassword(String newValue){
        this.password = newValue;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String newValue){
        this.name = newValue;
    }
}
