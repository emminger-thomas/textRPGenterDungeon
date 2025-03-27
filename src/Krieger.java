import java.util.Random;

public class Krieger extends Charakter{
    private int ruestung;
    private int staerke;

    public Krieger() {
        super();
        Random random = new Random();
        this.ruestung = 75 + random.nextInt(26);
        this.staerke = 80 + random.nextInt(21);
    }
    //Kampfmethode Vorgabe von Elternklasse
    /**
     *
     * @param schaden
     * schaden basierend auf staerke
     * ruestung des Gegners beruecksichtigen
     * @return schaden
     */
    public double kampf (double schaden){
        schaden = staerke / 4;

        return schaden;
    }

    public int getStaerke() {
        return staerke;
    }

    public void setStaerke(int staerke) {
        this.staerke = staerke;
    }

    public int getRuestung() {
        return ruestung;
    }

    public void setRuestung(int ruestung) {
        this.ruestung = ruestung;
    }

    @Override
    public String toString() {
        return "Krieger[" +
                "ruestung=" + ruestung +
                ", staerke=" + staerke +
                ", " + super.toString();
    }
}
