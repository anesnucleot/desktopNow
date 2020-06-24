package com.SuperServ.demo0.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Tarticle")
public class Carticle {
    @Id
    @Column(name="idarticle",nullable = false, unique = true)
    private String FidArticle;
    @Column(name="desarticle")
    private String FdesArticle;
    @Column(name="prixvente")
    private float FprixVente;


    public Carticle(String fidArticle, String fdesArticle, float fprixVente) {
        FidArticle = fidArticle;
        FdesArticle = fdesArticle;
        FprixVente = fprixVente;

    }

    public Carticle() {
    }

    public String getIdArticle() {
        return FidArticle;
    }

    public void setIdArticle(String idArticle) {
        this.FidArticle = idArticle;
    }

    public String getDesArticle() {
        return FdesArticle;
    }

    public void setDesArticle(String desArticle) {
        this.FdesArticle = desArticle;
    }

    public double getPrixVente() {
        return FprixVente;
    }

    public void setPrixVente(float prixVente) {
        this.FprixVente = prixVente;
    }

}
