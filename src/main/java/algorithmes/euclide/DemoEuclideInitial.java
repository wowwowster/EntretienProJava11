package algorithmes.euclide;

public class DemoEuclideInitial {


//    Réaliser un programme qui calcule le PGCD de deux nombres à l'aide de l’algorithme d’Euclide.
//            "On considère que pgcd(a,0)= a et que pour b différent de 0, pgcd(a,b) = (pgcd b, a mod b)".
//    On divise a par b ce qui donne un reste r < b.
//    On cherche à ce que le reste de la division soit 0.
//    Si r = 0 , PGCD (a,b) = b.
//            Sinon, PGCD (a,b) = PGCD (b,r) car ce qui est commun à a et b le sera pour r.

    public static void main (String[] args) {
        System.out.println(pgcd(255,141));
        System.out.println(pgcd(141,255));

        // résultats attendus =>    3
        //                          3
        //
        //

    }

    public static int pgcd( int first, int second ) {

    }
}
