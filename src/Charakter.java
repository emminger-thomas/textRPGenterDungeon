import java.util.Random;

public abstract class Charakter {
    private String name;
    private int gesundheit;
    private int initiative;
    private int level;
    private boolean imKampf = false;

    public Charakter(){
        Random random = new Random();
        this.name = Namen[random.nextInt(Namen.length)]; // Namen aus Array Zufallsbestimmt
        this.gesundheit = 65 + random.nextInt(35); //Gesundheit 65 - 100
        this.initiative = 1 + random.nextInt(21); //Initiative 1-20
        this.level = 1 + random.nextInt(21); // Level 1-20
    }
    // Vorschrift für Kindklassen, ist mind. eine Methode abstract ist auch die Klasse abstract

    public abstract double kampf (double schaden);

    private static final String[] Namen = {
            "Ragnar", "Björn", "Leif", "Erik", "Thorvald", "Ivar", "Olaf", "Harald", "Sigurd", "Rollo",
            "Gunnar", "Sven", "Torsten", "Halfdan", "Ulf", "Axel", "Thorfinn", "Orm", "Hakon", "Gorm",
            "Knut", "Einar", "Floki", "Arvid", "Magnus", "Frode", "Bjarke", "Egil", "Viggo", "Snorri",
            "Tore", "Valdemar", "Asger", "Gudmund", "Skarde", "Rune", "Alrik", "Hemming", "Torbjörn",
            "Njal", "Björk", "Styrbjörn", "Grimm", "Hilding", "Osvald", "Kettil", "Steinn", "Hagbard",
            "Frey", "Eirik", "Freya", "Astrid", "Ingrid", "Sigrid", "Lagertha", "Helga", "Thyra", "Sif",
            "Gudrun", "Solveig", "Ylva", "Hilda", "Brynhild", "Svanhild", "Yrsa", "Thora", "Ragnhild",
            "Gunhild", "Gerd", "Idun","Ulf"
    };
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGesundheit() {
        return gesundheit;
    }

    public void setGesundheit(int gesundheit) {
        this.gesundheit = gesundheit;
    }

    public int getInitiative() {
        return initiative;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public boolean getImKampf() {
        return imKampf;
    }

    public void setImKampf(boolean imKampf) {
        this.imKampf = imKampf;
    }
    @Override
    public String toString() {
        return "Name=" + name + ", Gesundheit=" + gesundheit +
                ", Initiative=" + initiative + ", Level="+ level+ "]";
    }
}
