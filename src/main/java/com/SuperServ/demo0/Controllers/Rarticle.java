package com.SuperServ.demo0.Controllers;

import com.SuperServ.demo0.Database.IArticleDataAccess;
import com.SuperServ.demo0.Models.Carticle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("rest/Article")
public class Rarticle {
    @Autowired
    private IArticleDataAccess articleDataAccess;

    @GetMapping("getArticles")
public List<Carticle> getArticles() throws SQLException, ClassNotFoundException {
//        List<Carticle> articles=new ArrayList<>();

//        Cconnection cn=new Cconnection();

//        articles.add(new Carticle(1,"ISIS",300) );
//        articles.add(new Carticle(2,"JAVEL",350) );
//        articles.add(new Carticle(3,"AIGLE",400) );
return articleDataAccess.findAll();
        //cn.getArticles();
    }
    @GetMapping("getArticle200")
    public List<Carticle> getArticle200() throws SQLException, ClassNotFoundException {

       return articleDataAccess.findArt2000();
    }

    @GetMapping("getArticleMax")
    public float getArticleMax() throws SQLException, ClassNotFoundException {

        return articleDataAccess.findArtMax();
    }
    
    @GetMapping("getNbrArt")
    public int getNbrArt() throws SQLException, ClassNotFoundException {

        return articleDataAccess.getNbrArt();
    }
    
    @GetMapping("/getNbr")
    public int getNbr() throws SQLException, ClassNotFoundException {

        return articleDataAccess.getNbr();
    }
    
    


    @GetMapping("/getArticleById/{id}")
    public Optional<Carticle> getArticleById(@PathVariable String id){
        //---------------------------------------------------------
     //   List<Carticle> articles=new ArrayList<>();
     //   articles.add(new Carticle("1","ISIS",300) );
     //   articles.add(new Carticle("2","JAVEL",350) );
     //   articles.add(new Carticle("3","AIGLE",400) );
        //---------------------------------------------------------
        //Carticle oarticle = articles.stream().filter(u ->  u.getIdArticle().equals(id)).findAny().orElse(null);
        return articleDataAccess.findById(id);
        //return oarticle;
    }

    
    @PostMapping("/setArticle")
    public void SetArticle(@RequestBody Carticle carticle){
        this.articleDataAccess.save(carticle);

    }
    
    @PostMapping("/delArticle")
    public void DelArticle(@RequestBody Carticle carticle){
        this.articleDataAccess.delete(carticle);

    }
   
}
