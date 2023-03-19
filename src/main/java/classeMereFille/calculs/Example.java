package classeMereFille.calculs;

public class Example
{
    public static int staticVar = 10;
    public int instanceVar = 5;

    public int add(int a, int b)
    {
        return a + b + staticVar + instanceVar;
    }

    public static int multiply(int a, int b)
    {
        return a * b * staticVar;
    }

    public static void main(String[] args)
    {
        Example ex1 = new Example();
        Example ex2 = new Example();
        ExampleSubclass exSub = new ExampleSubclass();

        ex1.instanceVar = 3;
        Example.staticVar = 2;

        int result1 = ex1.add(1, 2);
        int result2 = Example.multiply(2, 3);
        int result3 = ex2.add(4, 1);
        int result4 = Example.staticVar + ex1.instanceVar;
        int result5 = exSub.subtract(10, 3);
        int result6 = ExampleSubclass.multiply(3, 4);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
    }
}

class ExampleSubclass extends Example
{
    public static int staticVar = 7;
    public int instanceVar = 2;

    public int subtract(int a, int b)
    {
        return a - b - staticVar - instanceVar;
    }

    public static int multiply(int a, int b)
    {
        return a * b * staticVar;
    }
}
