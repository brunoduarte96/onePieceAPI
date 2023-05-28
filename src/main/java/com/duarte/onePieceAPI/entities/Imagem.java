package com.duarte.onePieceAPI.entities;

import jakarta.persistence.Embeddable;

@Embeddable
public class Imagem {

    private String eastBlue;
    private String alabasta;
    private String skypiea;
    private String water7;
    private String thrillerBark;
    private String sabaody;
    private String impelDown;
    private String marineFord;
    private String ilhaDosTritoes;
    private String aliancaPirata;
    private String dressrosa;
    private String wholeCake;
    private String wano;


    public Imagem() {
    }

    public Imagem(String eastBlue, String alabasta, String skypiea, String water7, String thrillerBark, String sabaody, String impelDown, String marineFord, String ilhaDosTritoes, String aliancaPirata, String dressrosa, String wholeCake, String wano) {
        this.eastBlue = eastBlue;
        this.alabasta = alabasta;
        this.skypiea = skypiea;
        this.water7 = water7;
        this.thrillerBark = thrillerBark;
        this.sabaody = sabaody;
        this.impelDown = impelDown;
        this.marineFord = marineFord;
        this.ilhaDosTritoes = ilhaDosTritoes;
        this.aliancaPirata = aliancaPirata;
        this.dressrosa = dressrosa;
        this.wholeCake = wholeCake;
        this.wano = wano;
    }

    public String getEastBlue() {
        return eastBlue;
    }

    public void setEastBlue(String eastBlue) {
        this.eastBlue = eastBlue;
    }

    public String getAlabasta() {
        return alabasta;
    }

    public void setAlabasta(String alabasta) {
        this.alabasta = alabasta;
    }

    public String getSkypiea() {
        return skypiea;
    }

    public void setSkypiea(String skypiea) {
        this.skypiea = skypiea;
    }

    public String getWater7() {
        return water7;
    }

    public void setWater7(String water7) {
        this.water7 = water7;
    }

    public String getThrillerBark() {
        return thrillerBark;
    }

    public void setThrillerBark(String thrillerBark) {
        this.thrillerBark = thrillerBark;
    }

    public String getSabaody() {
        return sabaody;
    }

    public void setSabaody(String sabaody) {
        this.sabaody = sabaody;
    }

    public String getImpelDown() {
        return impelDown;
    }

    public void setImpelDown(String impelDown) {
        this.impelDown = impelDown;
    }

    public String getMarineFord() {
        return marineFord;
    }

    public void setMarineFord(String marineFord) {
        this.marineFord = marineFord;
    }

    public String getIlhaDosTritoes() {
        return ilhaDosTritoes;
    }

    public void setIlhaDosTritoes(String ilhaDosTritoes) {
        this.ilhaDosTritoes = ilhaDosTritoes;
    }

    public String getAliancaPirata() {
        return aliancaPirata;
    }

    public void setAliancaPirata(String aliancaPirata) {
        this.aliancaPirata = aliancaPirata;
    }

    public String getDressrosa() {
        return dressrosa;
    }

    public void setDressrosa(String dressrosa) {
        this.dressrosa = dressrosa;
    }

    public String getWholeCake() {
        return wholeCake;
    }

    public void setWholeCake(String wholeCake) {
        this.wholeCake = wholeCake;
    }

    public String getWano() {
        return wano;
    }

    public void setWano(String wano) {
        this.wano = wano;
    }
}
