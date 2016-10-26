/*    1
*    1 1
*   1 2 1
*  1 3 3 1
* 1 4 6 4 1
*/

//0,1,1,2,3,5,8,13,21,...

package formation.reponse

public class {

  public static void main(String[] args){
    double premier = 0;
    double deuxieme = 1;
    double resultat = 0;
    
    while(true){
      resultat = premier + deuxieme;//calcule le resultat
      
      System.out.println(resultat); //imprimer le resultat
      
      premier = deuxieme;//mettre a niveau les chiffres
      deuxieme = resultat;
    }
  }
}
