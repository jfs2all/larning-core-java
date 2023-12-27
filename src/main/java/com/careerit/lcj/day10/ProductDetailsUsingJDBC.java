package com.careerit.lcj.day10;

import com.careerit.lcj.day9.Product;
import java.sql.*;
import java.util.List;

public class ProductDetailsUsingJDBC {
    private static final String url = "jdbc:postgresql://<url>/<dbname>";
    private static final String username = "<username>";
    private static final String password = "<password>";
    public static void main(String[] args) {
           /* List<Product> products = new SetExample3().getProducts();
            addProducts(products);*/
        showProducts();


    }

    public static void addProducts(List<Product> products){
        String sql = "insert into product(id,name,brand,price) values(?,?,?,?)";
        Connection con = null;
        PreparedStatement pst = null;
        try {
            con = DriverManager.getConnection(url, username, password);
            pst = con.prepareStatement(sql);
            for(Product product:products){
                pst.setLong(1,product.getId());
                pst.setString(2,product.getName());
                pst.setString(3,product.getBrand());
                pst.setDouble(4,product.getPrice());
                pst.executeUpdate();
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            try {
                if(pst != null) pst.close();
                if(con != null) con.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
    }

    public static void showProducts(){
        String sql = "select id,name,brand,price from product";
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;

        try{
            con = DriverManager.getConnection(url,username,password);
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                int id = rs.getInt("id");
                String pname = rs.getString("name");
                String brand = rs.getString("brand");
                double price = rs.getDouble("price");
                System.out.println(id+","+pname+","+price);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally{
            try {
                if(rs != null) rs.close();
                if(st != null) st.close();
                if(con != null) con.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
}
