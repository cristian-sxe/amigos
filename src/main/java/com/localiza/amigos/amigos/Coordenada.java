package com.localiza.amigos.amigos;

public class Coordenada {

    double lat;
    double lng;
    public Coordenada(){}
    @Override
    public String toString() {
        return "Coordenada{" +
                "lat=" + lat +
                ", lng=" + lng +
                '}';
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }



}
