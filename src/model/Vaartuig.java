package model;

public abstract class Vaartuig extends Vervoermiddel{
    //attributen
    private double lenteInMeter;

    //constructor
    protected Vaartuig(String merk, String type, double lenteInMeter) {
        super(merk, type);
        this.lenteInMeter = lenteInMeter;
    }
}
