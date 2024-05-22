package model;

public class Auto extends Voertuig{
    //attributen
    private String soortBrandstof;
    protected final static int AANTAL_WIELEN = 4;

    public Auto(String merk, String type, int gewicht, String soortBrandstof){
        super(merk, type, AANTAL_WIELEN, gewicht);
        this.soortBrandstof = soortBrandstof;
    }

    @Override
    String geefAandrijfKracht() {
        return String.format("%s %s", this.soortBrandstof, "motor");
    }
}
