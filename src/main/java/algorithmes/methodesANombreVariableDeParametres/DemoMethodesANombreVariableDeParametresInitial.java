package algorithmes.methodesANombreVariableDeParametres;

public class DemoMethodesANombreVariableDeParametresInitial {

    public static void main (String[] args) {

        System.out.println( "mini( 3 ) == " + mini( 3 ) );
        System.out.println( "mini( 3, 5 ) == " + mini( 3, 5 ) );
        System.out.println( "mini( 3, 5, 2 ) == " + mini( 3, 5, 2 ) );
        System.out.println( "mini( 3, 5, 2, 4 ) == " + mini( 3, 5, 2, 4 ) );
        System.out.println( "mini( 3, 5, 2, 4, 1 ) == " + mini( 3, 5, 2, 4, 1 ) );

    /*    System.out.println( "maxi( 3 ) == " + maxi( 3 ) );
        System.out.println( "maxi( 3, 5 ) == " + maxi( 3, 5 ) );
        System.out.println( "maxi( 3, 5, 2 ) == " + maxi( 3, 5, 2 ) );
        System.out.println( "maxi( 3, 5, 2, 4 ) == " + maxi( 3, 5, 2, 4 ) );
        System.out.println( "maxi( 3, 5, 2, 4, 1 ) == " + maxi( 3, 5, 2, 4, 1 ) );*/



        }
    private static int mini (int...values) {
        int valeur=values[0];
        for (int index=0;index<values.length-1; index++) {
            if(values[index+1]<values[index]){
                valeur=values[index+1];
            }
        }
        return valeur;
    }
}
