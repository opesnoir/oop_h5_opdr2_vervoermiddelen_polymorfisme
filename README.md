# oop_les5_polymorfisme

polymorfisme
abstracte klasse

voornaamste code, abstracte klasse array aanmaken, diverse voertuigsoorten erin stoppen en dan door de code lopen met een fori loop
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
