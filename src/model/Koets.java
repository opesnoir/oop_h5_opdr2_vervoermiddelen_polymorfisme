package model;

public class Koets extends Voertuig{
    //attributen
    private int aantalPaarden;
    protected final static int AANTAL_WIELEN = 4;

    //constructor
    public Koets(String merk, String type, int gewicht, int aantalPaarden){
        super(merk, type, AANTAL_WIELEN, gewicht);
        this.aantalPaarden = aantalPaarden;
    }

    @Override
    String geefAandrijfKracht() {
        return String.format("%d paarden", this.aantalPaarden) ;
    }
}
