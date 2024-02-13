
public class Cartypes {
  String i;
  String j;
  public Cartypes(){// Deafult constructor1
          i="CAR";
          j="TYPE";  
  }
  public Cartypes(String i, String j){// Paramatric constructor2
            this.i=i;
            this.j=j;
  }
  public static void main(String[] args) {
            // CREATING OBJECT
            Cartypes C1 = new Cartypes();
            Cartypes C2 = new Cartypes("FEARRI", "SPORT");  // object 1
            Cartypes C3 = new Cartypes("AUDI", "sport");    //object  2
            Cartypes C4 = new Cartypes("BENZE", "SUV");     // object 3
            System.out.println(C1.add());
             System.out.println(C2.add());
             System.out.println(C3.add());
             System.out.println(C4.add());                      
  }
  public String add() {
            return i+j;

  }
  
}

 