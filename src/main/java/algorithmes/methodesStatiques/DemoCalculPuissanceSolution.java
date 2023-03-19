package algorithmes.methodesStatiques;

public class DemoCalculPuissanceSolution {

    public static void main (String[] args) {

        System.out.println(power(2,0));
        System.out.println(power(2,1));
        System.out.println(power(2,2));
        System.out.println(power(2,3));

        // résultats attendus =>    1
        //                          2
        //                          4
        //                          8
    }

    public static int power( final int value, final int pow ) {
        int accumulator = 1;
        for (int index=0;index <pow;index++){
            accumulator=accumulator*value;
        }
        return accumulator;
    }
}
