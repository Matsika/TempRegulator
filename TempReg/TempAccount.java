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
    
    public String getPassword(){
        return password;
    }
    
    public int getAge() {
    	return age;
    }
    
    public String getEmail() {
    	return email;
    }
    
    public void setUserName(String userName) {
    	this.userName = userName;
    }
    
    public void setPassword(String password) {
    	this.password = password;
    }
    
    public void setAge(int age) {
    	this.age = age;
    }
    
    public void setEmail(String email) {
    	this.email = email;
    }
    
    public boolean verifyPassword(String password)
    {
        int specialCharacters = 0;
        int digitCount=0;
        int upperCaseChars = 0;
        int lowerCaseChars = 0;
        
        //password must be at least 8 characters long
        if(password.length() < 8)
        {
            return false;
        } 
        else
        {
            for(int i=0 ; i < password.length(); i++)  
            {
                char c = password.charAt(i);
                if(Character.isUpperCase(c))
                {
                   upperCaseChars++;
                }
                if(Character.isLowerCase(c))
                {    
                   lowerCaseChars++; 
                }
              
                if(Character.isDigit(c))
                {
                    digitCount++;
                }
                Pattern p = Pattern.compile("[^A-Za-z0-9]");
                Matcher m = p.matcher(password);  
                boolean b = m.find();
                if(b)
                {
                    specialCharacters++;
                } 
                
            } 
            //for the password to be valid it should have a least one uppercase letter,
            //one lowercase letter,at least one special character and at least one digit
            if(upperCaseChars >= 1 && lowerCaseChars >=1 && digitCount >=1 && specialCharacters >=1)
            {
                return true;
            } 
            else
            {
                return false;
            }     
        }    
        
    }  
    
    
}
