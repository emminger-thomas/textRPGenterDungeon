import java.util.Random;

public class Spaeher extends Charakter {
    private int agilitaet;
    private int ausdauer;

    public Spaeher(){
        super();
        Random random = new Random();
        this.agilitaet = 70 + random.nextInt(31); // agilität 70-100
        this.ausdauer = 75 + random.nextInt(26); // ausdauer 70-100
    }
    //Kampfmethode Vorgabe von Elternklasse
    /**
     *
     * @param schaden
     * schaden & wahrscheinlichkeit fuer kritische Treffer
     * basiert auf agilitaet
     * @return schaden
     */
    public double kampf (double schaden) {
        double wahrscheinlichkeit = (agilitaet - 10) / 100;
        //math Random generiert Zufallszahl zw. 0(inklusiv) und 1(exklusiv)
        double zufallszahl = Math.random();
        boolean krit = wahrscheinlichkeit > zufallszahl;
        if (krit = true) {
            schaden = (agilitaet / 4) * 0.25;
        } else {
            schaden = agilitaet / 4;
        }
        return schaden;
    }

    public int getAgilitaet() {
        return agilitaet;
    }

    public void setAgilitaet(int agilitaet) {
        this.agilitaet = agilitaet;
    }

    public int getAusdauer() {
        return ausdauer;
    }

    public void setAusdauer(int ausdauer) {
        this.ausdauer = ausdauer;
    }

    @Override
    public String toString() {
        return "Spaeher[" +
                "agilitaet=" + agilitaet +
                ", ausdauer=" + ausdauer +
                ", " + super.toString();
    }
}
