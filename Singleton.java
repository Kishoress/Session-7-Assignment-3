import java.util.UUID;
class Singleton {

     private static Singleton single = null;

     private String ID = null;

     private Singleton() {

          ID = UUID.randomUUID().toString(); // Create a random ID.
     }
     public static Singleton getInstance() {

          if (single == null)

               single = new Singleton();

          return single;

     }

     public String getID() {

          return this.ID;

     }

}

public class TestSingleton {

     public static void main(String[] args) {

          Singleton s = Singleton.getInstance();

          System.out.println(s.getID());

     }
}


