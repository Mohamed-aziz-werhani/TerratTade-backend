
package com.module_project.service1_ex.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;



@Document(collection = "offers")
public class Offer {
    @Id
    private String id;
    private String propertyId; // ID de la propriété concernée
    private String userId; // ID de l'utilisateur ayant fait l'offre
    private double offeredPrice; // Prix proposé par l'acheteur
    private String status;
    private String description; // Description détaillée
  private String image;
  
    /**
     * @return the id
     */
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
     * @return the propertyId
     */
    public String getPropertyId() {
        return propertyId;
    }

    /**
     * @param propertyId the propertyId to set
     */
    public void setPropertyId(String propertyId) {
        this.propertyId = propertyId;
    }

    /**
     * @return the userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * @return the offeredPrice
     */
    public double getOfferedPrice() {
        return offeredPrice;
    }

    /**
     * @param offeredPrice the offeredPrice to set
     */
    public void setOfferedPrice(double offeredPrice) {
        this.offeredPrice = offeredPrice;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
 public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
public String getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(String image) {
        this.image = image;
    }



}
