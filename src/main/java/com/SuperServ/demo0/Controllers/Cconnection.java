package com.SuperServ.demo0.Controllers;

import com.SuperServ.demo0.Models.Carticle;

import java.sql.*;
import java.util.List;


public class Cconnection {
    public Cconnection() {
    }

    public List<Carticle> getArticles() throws ClassNotFoundException, SQLException {
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        Connection con;
        con = DriverManager.getConnection("jdbc:odbc:ADB");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from Tarticle");
        List<Carticle> oArticles = null;
        while (rs.next()) {
            String idArticle = rs.getString("idArticle");
            String desArticle = rs.getString("desArticle");
            oArticles.add(new Carticle(idArticle,desArticle,200));
        }
        return oArticles;
    }


}
