package classeMereFille;

public class Mere
{

    public static String staticVar = "staticVar mère";
    public String instanceVar = "instanceVar mère";

    public Mere()
    {

    }

    public void presentation()
    {
        System.out.println("Je suis la classe Mere");
    }

    public void presentationOverrided()
    {
        System.out.println("Je suis la classe Mere Overrided");
    }

    static public void presentationStatic()
    {
        System.out.println("Je suis la classe mere Static");
    }
}