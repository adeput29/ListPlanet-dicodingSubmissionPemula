package com.example.listplanet;

public class Planet {
    private String NamaPlanet;
    private String diameterPlanet;

    public String getDetailPlanet() {
        return detailPlanet;
    }

    public void setDetailPlanet(String detailPlanet) {
        this.detailPlanet = detailPlanet;
    }

    private String detailPlanet;
    private int photoPlanet;

    public String getNamaPlanet() {
        return NamaPlanet;
    }

    public void setNamaPlanet(String namaPlanet) {
        NamaPlanet = namaPlanet;
    }

    public String getDiameterPlanet() {
        return diameterPlanet;
    }

    public void setDiameterPlanet(String diameterPlanet) {
        this.diameterPlanet = diameterPlanet;
    }

    public int getPhotoPlanet() {
        return photoPlanet;
    }

    public void setPhotoPlanet(int photoPlanet) {
        this.photoPlanet = photoPlanet;
    }
}
