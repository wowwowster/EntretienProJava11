package classeMereFille;

public class FilleA extends Mere
{
    int x;

    public static String staticVar = "staticVar filleA";
    public String instanceVar = "instanceVar filleA";

    public FilleA()
    {

        String toto = "toto";
        // erreur this(10);

        // erreur super();

    }

    FilleA(int x)
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
