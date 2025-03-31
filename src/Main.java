import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    ArrayList<Charakter> charakters = new ArrayList<>();

    charakters.add(new Magier());
    charakters.add(new Krieger());
    charakters.add(new Spaeher());

    System.out.println("3 Helden stellen sich im Sparring:");

    System.out.println(charakters.get(0));
    System.out.println(charakters.get(1));
    System.out.println(charakters.get(2));
    System.out.println("");



   angriff(charakters.get(0), charakters.get(1));
   rueckschlag(charakters.get(0), charakters.get(1));
 }

  public static void angriff(Charakter a, Charakter b) {
      if (a instanceof Magier && b instanceof Krieger) {
          Magier magier = (Magier) a;
          Krieger krieger = (Krieger) b;

          System.out.println("Kampfbeginn!" + a.getName() + " greift " + b.getName() + " an.");
          System.out.println(a.getName() + " fügt " + b.getName() + " " + a.berechneSchaden() + " Schaden zu.");
          b.setGesundheit(b.getGesundheit() - a.berechneSchaden());
          System.out.println(b.getName() + " hat noch " + b.getGesundheit() + " Lebenspunkte");
          System.out.println("");
      } else {
          System.out.println("Something went wrong");
         }

  }
      public static void rueckschlag (Charakter a, Charakter b){
          if (a instanceof Magier && b instanceof Krieger) {
              Magier magier = (Magier) a;
              Krieger krieger = (Krieger) b;
              System.out.println(b.getName() + " schlägt zurück!");
              System.out.println(b.getName() + " fügt " + a.getName() + " " + b.berechneSchaden() + " Schaden zu.");
              a.setGesundheit(a.getGesundheit() - b.berechneSchaden());
              System.out.println(a.getName() + " hat noch " + a.getGesundheit() + " Lebenspunkte");
              } else {
              System.out.println("Pustekuchen");
          }
      }
  }