import java.util.*;
public class User extends Entity {
    private String email;
    private String name;
    private String surname;
    private String password;

    public User(String email, String name, String surname, String password){
            this.email = email;
            this.name = name;
            this.surname = surname;
            this.password = password;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.email = name;
    }

    public String getSurname(){
        return this.surname;
    }

    public void setSurname(String surname){
        this.email = surname;
    }

    public String getPassword(){
        return this.password;
    }

    public void setPassword(String password){
        this.email = password;
    }








}
