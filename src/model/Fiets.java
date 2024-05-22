package model;

public class Fiets extends Voertuig{
    //attributen
    protected final static int AANTAL_WIELEN = 2;
    //constructor
    public Fiets(String merk, String type, int gewicht){
        super(merk, type, AANTAL_WIELEN, gewicht);
    }
    //methode
    @Override
    String geefAandrijfKracht() {
        return ("menskracht");
    }
}
