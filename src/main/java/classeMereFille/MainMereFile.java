package classeMereFille;

public class MainMereFile
{

    public static void main(String[] args)
    {
        Fille fille = new Fille();
        Mere mereFromFille = fille; // upcasting explicite
        Fille filleFromMereFromFille = (Fille) mereFromFille; // downcasting
        //  Fille filleFromMere = new Mere();  => downcasting impossible
        // Fille filleFromMereFromFilleB =  mereFromFille;   =>  downcasting implicite, c'est interdit

        fille.presentation();
        mereFromFille.presentation();
        filleFromMereFromFille.presentation();

        fille.presentationStatic();
        mereFromFille.presentationStatic();
        filleFromMereFromFille.presentationStatic();

        fille.presentationOverrided();
        mereFromFille.presentationOverrided();
        filleFromMereFromFille.presentationOverrided();

        System.out.println("fille.instanceVar = " + fille.instanceVar);
        System.out.println("mereFromFille.instanceVar = " + mereFromFille.instanceVar);
        System.out.println("filleFromMereFromFille.instanceVar = " + filleFromMereFromFille.instanceVar);

        System.out.println("fille.staticVar = " + fille.staticVar);
        System.out.println("mereFromFille.staticVar = " + mereFromFille.staticVar);
        System.out.println("filleFromMereFromFille.staticVar = " + filleFromMereFromFille.staticVar);
    }
}
