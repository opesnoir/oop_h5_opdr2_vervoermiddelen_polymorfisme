package model;

public class Zeilboot extends Vaartuig{
    //constructor
    public Zeilboot(String merk, String type, double lengte){
        super(merk, type, lengte);
    }
    //methode
    @Override
    String geefAandrijfKracht() {
        return ("windkracht");
    }
}
