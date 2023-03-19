package algorithmes.methodesANombreVariableDeParametres;

public class DemoMethodesANombreVariableDeParametresSolution {

    public static void main (String[] args) {
        System.out.println( "mini( 3 ) == " + mini( 3 ) );
        System.out.println( "mini( 3, 5 ) == " + mini( 3, 5 ) );
        System.out.println( "mini( 3, 5, 2 ) == " + mini( 3, 5, 2 ) );
        System.out.println( "mini( 3, 5, 2, 4 ) == " + mini( 3, 5, 2, 4 ) );
        System.out.println( "mini( 3, 5, 2, 4, 1 ) == " + mini( 3, 5, 2, 4, 1 ) );

        System.out.println( "maxi( 3 ) == " + maxi( 3 ) );
        System.out.println( "maxi( 3, 5 ) == " + maxi( 3, 5 ) );
        System.out.println( "maxi( 3, 5, 2 ) == " + maxi( 3, 5, 2 ) );
        System.out.println( "maxi( 3, 5, 2, 4 ) == " + maxi( 3, 5, 2, 4 ) );
        System.out.println( "maxi( 3, 5, 2, 4, 1 ) == " + maxi( 3, 5, 2, 4, 1 ) );
    }

    private static int maxi(int... values) {
        int valeur;
        if (values.length == 0)
            throw new RuntimeException( "This method require at least one parameter" );
        else valeur=values[0];
        for (int index=0 ;index<values.length  ; index++) {
            if(values[index]>valeur)
                valeur = values[index];
        }
        return valeur;
    }

    private static int mini(int... values) {
        int valeur;
        if (values.length == 0)
            throw new RuntimeException( "This method require at least one parameter" );
        else valeur=values[0];
        for (int index=0 ;index<values.length  ; index++) {
            if(values[index]<valeur)
                valeur = values[index];
        }
        return valeur;
    }
}
