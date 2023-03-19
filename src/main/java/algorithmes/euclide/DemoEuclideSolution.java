package algorithmes.euclide;

public class DemoEuclideSolution {

    public static void main (String[] args) {
        System.out.println(pgcd(255,141));
        System.out.println(pgcd(141,255));
        // résultats attendus =>    3
        //                          3

    }

    public static int pgcd( int first, int second ) {
        while( second != 0 ) {
            int rest = first % second;
            first = second;
            second = rest;
        }
        return first;
    }
}
