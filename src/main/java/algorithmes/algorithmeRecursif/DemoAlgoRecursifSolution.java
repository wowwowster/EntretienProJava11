package algorithmes.algorithmeRecursif;

public class DemoAlgoRecursifSolution {

    public static void main(String[] args) {

        System.out.println( "0! == " + factRec( 0 ) );  // 1
        System.out.println( "1! == " + factRec( 1 ) );  // 1
        System.out.println( "3! == " + factRec( 3 ) );  // 6
        System.out.println( "5! == " + factRec( 5 ) );  // 120
        System.out.println( "6! == " + factRec( 6 ) );  // 720
    }

   //méthode pas optimale
   private static int factRecB(int entierSource) {
        int entierFactorielle =  entierSource ;
        if (entierSource == 0 || entierSource == 1) return 1;
        else {
            while (entierSource>1) {
                entierFactorielle = entierFactorielle * (--entierSource);
            }
        }
        return entierFactorielle;
    }

    private static int factRec (int entierSource) {
        if (entierSource == 0 || entierSource == 1) return 1;
        return entierSource*factRec (entierSource-1);
    }
}
