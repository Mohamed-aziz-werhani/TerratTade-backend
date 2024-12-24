package com.module_project.service1_ex.model;


import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;



@Document(collection = "properties")
public class Property {

    /**
     * @return the image
     */
    
    @Id
    private String id;
    private String type; // Titre de la propriété (ex. "Terrain agricole 5ha")
    private String user_Id; // ID de l'utilisateur propriétaire
    private String location; // Localisation de la propriété
    private double prix; // Prix de vente 
    private double surface;
    private int parties;
    private String ref;
 
 
   /* public Property(String type,String des,String uid,String location,double prix,String image){
    this.description=des;
    this.image=image;
    this.location=location;
    this.type=type;
    this.user_Id=id;
    this.prix=prix;
    
    
    }*/
    
    
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the description
     */
   

    /**
     * @return the user_Id
     */
    public String getUser_Id() {
        return user_Id;
    }

    /**
     * @param user_Id the user_Id to set
     */
    public void setUser_Id(String user_Id) {
        this.user_Id = user_Id;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return the prix
     */
    public double getPrix() {
        return prix;
    }

    /**
     * @param prix the prix to set
     */
    public void setPrix(double prix) {
        this.prix = prix;
    }
    
    

    /**
     * @return the surface
     */
    public double getSurface() {
        return surface;
    }
    
    public void setSurface(double s){
    this.surface=s;
    }
    
}
