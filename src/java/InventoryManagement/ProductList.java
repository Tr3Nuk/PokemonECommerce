/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InventoryManagement;

import Database.OracleSql;
import Models.CategoryModel;
import Models.ProductListModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Jeff
 */
public class ProductList {
    
   private int productId;
   private String name;
   private int price;
   private ArrayList<CategoryModel> category;
   private boolean status;
   private ArrayList<ProductListModel> products; 
   private OracleSql query;
   private ResultSet productSet;
   
   public ProductList()
   {
    System.out.println("Establishing Oracle SQL Query Object");
    query = new OracleSql();
    products = new ArrayList<>();
    category = new ArrayList<>();
    System.out.println("Creating Statement...");
    query.createStatement();
    
   }
   public void getProductList()
   {
      System.out.println("Selecting Records...");
      String sql = "SELECT PRODUCTID, NAME, PRICE, CATEGORY, STATUS FROM PRODUCTLIST";
      System.out.println("Executing Query...");
      query.executeQuery(sql);
      productSet = query.getResultSet();
      
       try {
             while(productSet.next())
             {
                 productId = productSet.getInt("PRODUCTID");
                 name = productSet.getString("NAME");
                 price = productSet.getInt("PRICE");
                 //use .add fro ArrayList<> 
                 category.add(new CategoryModel(productSet.getString("CATEGORY")));
                 //use for boolean
                 if(productSet.getInt("STATUS") == 0)
                 {
                     status = false;
                 }
                 else
                 {
                     status = true;
                 }
                 products.add(new ProductListModel(productId, name, price, category, status));
             }
       } catch (SQLException e) {
           e.printStackTrace();
       }
       finally{
           query.closConn();
       }
      
   }
   public void display()
   {
       System.out.println();
       for(int i =0; i < products.size(); i++)
       {
           System.out.println(products.get(i));
           
       }
   }

    public ArrayList<ProductListModel> getProducts() {
        return products;
    }
   
   
}
