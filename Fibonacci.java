/*    1
*    1 1
*   1 2 1
*  1 3 3 1
* 1 4 6 4 1
*/

//0,1,1,2,3,5,8,13,21,...

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formation;

/**
 *
 * @author TheAmo
 */
public class Fibonacci {

    public static void main(String[] args) {
        double premier = 0;
        double deuxieme = 1;
        double resultat = 0;

        while (true) {
            System.out.println(resultat); //imprimer le resultat
            resultat = premier + deuxieme;//calcule le resultat

            premier = deuxieme;//mettre a niveau les chiffres
            deuxieme = resultat;
            if(resultat > 1.3069892237633987E308 ){ //limite theorique du double. arrete pour pas avoir infini
                System.exit(1);                         
            }
        }
    }
}
