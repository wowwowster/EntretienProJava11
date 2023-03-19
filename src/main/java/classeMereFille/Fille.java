package classeMereFille;

public class Fille extends Mere
{
    int x;

    public static String staticVar = "staticVar fille";
    public String instanceVar = "instanceVar fille";

    public Fille()
    {

        String toto = "toto";
        // erreur this(10);

        // erreur super();

    }

    Fille(int x)
    {
        this.x = x;
    }

    public void presentation()
    {
        //super.presentation();
        System.out.println("Je suis la classe fille ");
    }

    @Override
    public void presentationOverrided()
    {
        System.out.println("Je suis la classe fille Overrided");
    }

    static public void presentationStatic()
    {
        System.out.println("Je suis la classe fille Static");
    }
}
