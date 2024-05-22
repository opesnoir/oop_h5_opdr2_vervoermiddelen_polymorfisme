package model;

public abstract class Vervoermiddel {
    //attributen
    private int id;
    private static int aantalVervoermiddelen;
    private String merk;
    private String type;

    //constructor
    protected Vervoermiddel(String merk, String type){
        this.merk = merk;
        this.type = type;
        this.id = Vervoermiddel.aantalVervoermiddelen++; //het is static, dus je verwijst naar de klasse ipv this te gebruiken
    }

    //methode
    abstract String geefAandrijfKracht(); //abstracte methodes hebben geen body

    @Override
    public String toString() {
        return String.format("Vervoermiddel #%d %s %s aangedreven door" , id, merk, type);
    }
}
