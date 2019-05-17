/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tempaccount.java;

/**
 *
 * @author TinotendaMatsika
 */
public class TempAccount {

    private String userName;
    private String password;
    private int age;
    private String email;
    
    public TempAccount(String username, String password,int age, String email){
        this.userName = userName;
        this.password = password;
        this.age = age;
        this.email = email;
        
    }
    
    public String getUserName(){
        return userName;
    }
    
    
    
    
}
