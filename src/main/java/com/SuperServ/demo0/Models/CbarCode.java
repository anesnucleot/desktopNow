package com.SuperServ.demo0.Models;


import javax.persistence.*;

@Entity
@Table(name = "Tbarcode")
public class CbarCode {
    @Id
    @Column(name="idbarcode",nullable = false, unique = true)
    private String idBarCode;
    @Column(name="idarticle")
    private String idArticle;
    @Column(name="symbole")
    private String symbole;

//    @JsonInclude
//    @Transient
//    @ManyToOne(fetch=FetchType.LAZY)
//    @JoinColumn(name="idarticle")    
//    private Carticle carticle;

    public CbarCode() {
    }

    public CbarCode(String idbarCode, String idArticle, String symbole) {
        this.idBarCode = idbarCode;
        this.idArticle = idArticle;
        this.symbole = symbole;
    }

    public String getIdbarCode() {
        return idBarCode;
    }

    public void setIdbarCode(String idbarCode) {
        this.idBarCode = idbarCode;
    }

    public String getIdArticle() {
        return idArticle;
    }

    public void setIdArticle(String idArticle) {
        this.idArticle = idArticle;
    }

    public String getSymbole() {
        return symbole;
    }

    public void setSymbole(String symbole) {
        this.symbole = symbole;
    }
}



