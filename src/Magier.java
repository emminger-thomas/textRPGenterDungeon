import java.util.Random;

public class Magier extends Charakter {
    private int intelligenz;
    private int mana;

    public Magier() {
        // Aufruf des Konstruktors der Oberklasse
        super();
        Random random = new Random();
        this.intelligenz = 75 + random.nextInt(26); // intelligenz 75 -100
        this.mana = 50 + random.nextInt(51); // mana 50 - 100
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getIntelligenz() {
        return intelligenz;
    }

    public void setIntelligenz(int intelligenz) {
        this.intelligenz = intelligenz;
    }

    @Override
    public String toString() {
        return "Magier[" +
                "intelligenz=" + intelligenz +
                ", mana=" + mana +
                ", " + super.toString();
    }
    //Vorgabe von Elternklasse
    /**
     * @param schaden
     * basierend auf Intelligenz, verringert Mana
     * @return schaden
     */
    public double kampf (double schaden){
        if (mana > 6) {
            schaden = intelligenz / 4;
            mana = mana - 5;
            setMana(mana);
            return schaden;
        } else {
            System.out.println("Mana reicht nicht mehr zum Zaubern");
            schaden = 0;
        }
        return schaden;
    }

}
