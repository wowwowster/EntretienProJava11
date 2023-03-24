package classeMereFille;

public class MainMereFille
{

    public static void main(String[] args)
    {
        FilleA filleA = new FilleA();
        Mere mereFromFilleA = filleA; // upcasting explicite
        FilleA filleFromMereFromFille = (FilleA) mereFromFilleA; // downcasting
        //  Fille filleFromMere = new Mere();  => downcasting impossible
        // Fille filleFromMereFromFilleB =  mereFromFille;   =>  downcasting implicite, c'est interdit
        Mere mereFromFilleB = new FilleB();
        // Mere mereFromFilleAetB = (FilleA) mereFromFilleB;   impossible

        filleA.presentation();
        mereFromFilleA.presentation();
        filleFromMereFromFille.presentation();

        filleA.presentationStatic();
        mereFromFilleA.presentationStatic();
        filleFromMereFromFille.presentationStatic();

        filleA.presentationOverrided();
        mereFromFilleA.presentationOverrided();
        filleFromMereFromFille.presentationOverrided();

        System.out.println("fille.instanceVar = " + filleA.instanceVar);
        System.out.println("mereFromFille.instanceVar = " + mereFromFilleA.instanceVar);
        System.out.println("filleFromMereFromFille.instanceVar = " + filleFromMereFromFille.instanceVar);

        System.out.println("fille.staticVar = " + filleA.staticVar);
        System.out.println("mereFromFille.staticVar = " + mereFromFilleA.staticVar);
        System.out.println("filleFromMereFromFille.staticVar = " + filleFromMereFromFille.staticVar);
    }
}
