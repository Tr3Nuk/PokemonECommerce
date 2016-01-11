/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Jeff
 */

//Model == JavaBeans
/*
   For Java Class that is model to be considered beaing a java bean
  The following requirements have to be met:
  1) All fields must be private
  2) All fields mustbe accessed via getter and setter methods
  3) The class needs to have one NON overloaded constructor == constructor
with not paramter accepted
  4) The class needs to implement seriazable interface.
  

 //Methods
           
                Any variable inside method is consider a local variable
                All those variables are only accesible from the scope of that
                method 
           However, if you have field == variable that is on top of all methods
           is accessible by all methods in the class and STATE of that variable
           is preserved in the object.
           
*/

public class ProductListModel implements Serializable  {
    
    //private fields must match to database
    
   private int productId;
   private String name;
   private int price;
   private ArrayList<CategoryModel> category;
   private int stockQuantity;
   private boolean status;
   private String description;
   private int rating;
   private String img;
   
   public ProductListModel()
   {
      
   }

    public ProductListModel(int productId, String name, int price, 
            ArrayList<CategoryModel> category, boolean status) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.category = category;
        this.status = status;
    }
   
    public ProductListModel(int productId, String name, int price, 
            ArrayList<CategoryModel> category, int stockQuantity, 
            boolean status, String description, int rating, String img) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.category = category;
        this.stockQuantity = stockQuantity;
        this.status = status;
        this.description = description;
        this.rating = rating;
        this.img = img;
    }
   
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

  

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "ProductListModel{" + "productId=" + productId + ", name=" + name +
                ", price=" + price + ", category=" + category + ", stockQuantity=" 
                + stockQuantity + ", status=" + status + ", description=" 
                + description + ", rating=" + rating + ", img=" + img + '}';
    }

    public ArrayList<CategoryModel> getCategory() {
        return category;
    }

    public void setCategory(ArrayList<CategoryModel> category) {
        this.category = category;
    }
    
}
