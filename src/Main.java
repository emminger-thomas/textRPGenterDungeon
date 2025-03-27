import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

      ArrayList<Charakter> charakters = new ArrayList<>();

      charakters.add(new Magier());
      charakters.add(new Krieger());
      charakters.add(new Spaeher());

      System.out.println(charakters.size());

      System.out.println(charakters.get(0));
      System.out.println(charakters.get(1));
      System.out.println(charakters.get(2));
      System.out.println(charakters.get(0).getImKampf());

      System.out.println(charakters.get(0).getClass().getSimpleName());

      if(charakters.get(0) instanceof Krieger){
        System.out.println("Krieger");
      } else{
        System.out.println("Hase");
      }
    }
}