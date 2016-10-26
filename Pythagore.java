package formaion.reponse

public class {

  public static void main(String[] args){
    Scanner input = new Scanner(System.in); 
    double a;
    double b;
    double c;
    double resultat;
    String reponse = "*&()_";
    
    while(true){
      System.out.println("Enter the number seek : ");
      reponse = input.next();

      if(reponse.equals("*&()_")){
        System.exit(1);
      }

      if(reponse.equals("A") || reponse.equals("a")){
        System.out.println("Enter the 'b' variable : ");
        b = input.nextDouble();
        System.out.println("Enter the 'c' variable : ");
        c = input.nextDouble();
        resultat = Math.sqrt(((c * c) - (b * b)))
        System.out.println("a equals " + resultat);
      }

      if(reponse.equals("B") || reponse.equals("b")){
        System.out.println("Enter the 'a' variable : ");
        a = input.nextDouble();
        System.out.println("Enter the 'c' variable : ");
        c = input.nextDouble();
        resultat = Math.sqrt(((c * c) - (a * a)))
        System.out.println("b equals " + resultat);
      }

      if(reponse.equals("C") || reponse.equals("c")){
        System.out.println("Enter the 'a' variable : ");
        a = input.nextDouble();
        System.out.println("Enter the 'b' variable : ");
        c = input.nextDouble();
        resultat = Math.sqrt(((b * b) + (a * a)))
        System.out.println("c equals " + resultat);
      }
    }
  }
}
