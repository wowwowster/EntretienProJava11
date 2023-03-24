package classeMereFille;

public class FilleB extends Mere
{
    int x;

    public static String staticVar = "staticVar fille B";
    public String instanceVar = "instanceVar fille B";

    public FilleB()
    {

        String toto = "toto";
        // erreur this(10);

        // erreur super();

    }

    FilleB(int x)
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
