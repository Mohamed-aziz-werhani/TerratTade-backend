package com.module_project.service1_ex.model;
import java.util.ArrayList;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection = "users")
public class User {
    @Id // Clé primaire unique
      private String id;
    private String name;
    private String email;
    private int phone; // Numéro de téléphone
     private String password;
    private List<String> offers; 
    private Role type;  
    
    
public enum Role {
    NORMAL_USER,
    ADMIN
}
   /* public User(String name,String email,int phone,String role){
   this.email=email;
   this.name=name;
   this.phone=phone;
   this.role=role;
   this.offers=new ArrayList<>();
    }*/
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
public Role getType() {
        return type;
    }

    public void setType(Role type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the phone
     */
    public int getPhone() {
        return phone;
    }

    /**
     * @return the role
     */
   
    /**
     * @return the offers
     */
    public List<String> getOffers() {
        return offers;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }
    public void setPassword(String p) {
        this.password=p;
    }
    
}

