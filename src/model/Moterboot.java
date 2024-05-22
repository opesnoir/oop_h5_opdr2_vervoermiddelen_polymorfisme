package model;

public class Moterboot extends Vaartuig{
    //attribuut
    private String soortBrandstof;
    //constructor
    public Moterboot(String merk, String type, double lengte, String soortBrandstof){
        super(merk, type, lengte);
        this.soortBrandstof = soortBrandstof;
    }

    @Override
    String geefAandrijfKracht() {
        return String.format("%s motor", soortBrandstof);
    }
}
