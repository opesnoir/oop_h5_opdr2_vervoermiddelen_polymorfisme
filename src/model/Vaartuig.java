package model;

public abstract class Vaartuig extends Vervoermiddel{
    //attributen
    private double lengte;

    //constructor
    protected Vaartuig(String merk, String type, double lengte) {
        super(merk, type);
        this.lengte = lengte;
    }
}
