package com.SuperServ.demo0.Database;

import com.SuperServ.demo0.Models.Carticle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IArticleDataAccess extends JpaRepository<Carticle,String>{
    @Query(
            value = "SELECT * FROM tarticle u WHERE u.prixVente > 100",
            nativeQuery = true)
    List<Carticle> findArt2000();
    
    @Query(
            value = "SELECT * FROM tarticle u WHERE u.prixVente > 100",
            nativeQuery = true)
    List<Carticle> findArt3000();

    @Query(
            value = "SELECT max(u.prixVente) FROM tarticle u ",
            nativeQuery = true)
    float findArtMax();
    
    @Query (value = "SELECT count(*) FROM tarticle u ", nativeQuery = true)
   	int getNbrArt();
       

    
    @Query (value = "SELECT * FROM tarticle u where u.desarticle like  ", nativeQuery = true)
	int getNbr();
    

    



}
