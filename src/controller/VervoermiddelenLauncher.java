package controller;

import model.*;

public class VervoermiddelenLauncher {
    public static void main(String[] args) {

/*        //Maak een koets van het merk Glinkowski, type marathonwagen voor twee paarden, 320kg
        Koets koets = new Koets("Glinkowski", "marathonwagen", 320, 2);
        System.out.println(koets);

        //Maak een auto van het merk Dacia, type Logan MPV, 1150kg, rijdt op benzine
        Auto auto = new Auto("Dacia", "Logan MPV", 1150, "benzine");
        System.out.println(auto);

        //Maak een fiets van het merk Koga Mijata, type Colmaro Race Ultegra, 9kg
        Fiets fiets = new Fiets("Koga Mijata", "Colomaro Race Ultegra", 9);
        System.out.println(fiets);

        //Maak een zeilboot Dufour 36 Classic van 11.5 meter
        Zeilboot zeilboot = new Zeilboot("Dufour 36", "Classic", 11.5);
        System.out.println(zeilboot);

        //Maak een motorboot Broesder Kotter van 13,75 meter met een diesel motor
        Moterboot moterboot = new Moterboot("Broesder", "Kotter", 13.75, "diesel");
        System.out.println(moterboot);*/


        // array
        Vervoermiddel[] vervoermiddel = new Vervoermiddel[5];
        vervoermiddel[0] = new Koets("Glinkowski", "marathonwagen", 320, 2);
        vervoermiddel[1] = new Auto("Dacia", "Logan MPV", 1150, "benzine");
        vervoermiddel[2] = new Fiets("Koga Mijata", "Colomaro Race Ultegra", 9);
        vervoermiddel[3] = new Zeilboot("Dufour 36", "Classic", 11.5);
        vervoermiddel[4] = new Moterboot("Broesder", "Kotter", 13.75, "diesel");

        //door heen loopen
        for (int i = 0; i < vervoermiddel.length; i++) {
            System.out.println(vervoermiddel[i]);

        }
    }
}
