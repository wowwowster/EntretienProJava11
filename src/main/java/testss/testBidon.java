package testss;

import java.util.ArrayList;
import java.util.Arrays;

class Base
{
    int x = 10;

    void display()
    {
        System.out.println("Base");
    }
}

class Derived extends Base
{
    int x = 20;

    void display()
    {
        System.out.println("Derived");
    }
}

public class testBidon
{

    private static String tyty = "";
    private static Integer tssyty = 2;

    private static interface List
    {
        void add();

        String getCustomerNames();
    }

    public static void main(String[] args) throws Exception
    {

        int[] arr =
        {
            1,
            2,
            3
        };
        Integer[] boxedArr = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(boxedArr));

        /*nt num = 5;
        do {
            System.out.print(num-- +"");
        } while (num==0);
        
        
        
               String nomFichier = " Un  DEUX    tRIS    QUATRE    .pdf";
        
               int a1 = 5; double a2 = (float)a1;
        
               System.out.println("a1=" + a1);
              nomFichier = nomFichier.replaceAll("\\s+", " ");
              System.out.println(nomFichier);
              DoubleStream stream5 = DoubleStream.generate(Math::random);
              System.out.println(stream5.count());
              System.out.println("fin de la lecture du stream");
        
               List<Integer> someNumbers = Arrays.asList(1, 2, 3, 4, 5);
               Optional<Integer> firstSquareDivisibleByThree =
               someNumbers.stream()
                       .map(x -> x * x)
                       .filter(x -> x % 3 == 0)
                       .findFirst(); // 9
        
        
        
        
        Base b = new Base();
        Derived d = new Derived();
        Base bd = new Derived();
        
        // System.out.println(b.x + " " + d.x + " " + bd.x);
        
        b.display();
        d.display();
        bd.display();
        System.out.println();  */

        /* StringBuilder sb = new StringBuilder(5);
        System.out.println("toto"+sb.toString());
        
        int a[] = {1, 2, 053, 4};
        int b[][] = {{1, 2, 4}, {2, 2, 1}, {0, 43, 2}};
        System.out.print(a[3] == b[0][2]);
        System.out.print(" " + (a[2] == b[2][1]));   */

        /*  int x = 100;
        int a = x++;
        int d = (a<x) ? (a<x) ? a : (a<x)  ? a: x : a ;  */

        /*
        String ta = "A ";
        ta = ta.concat("B ");
        String tb =  "C ";
        ta = ta.concat(tb);
        ta = ta.replace('C', 'D');
        ta = ta.concat(tb);
        System.out.println(ta);  */

        String[][] chs = new String[2][];
        chs[0] = new String[2];
        chs[1] = new String[5];
        int i = 97;
        for (int a = 0; a < chs.length; a++)
        {
            for (int b = 0; b < chs.length; b++)
            {
                chs[a][b] = "" + i;
                i++;
            }
        }
        for (String[] ca : chs)
        {
            for (String c : ca)
            {
                System.out.print(c + " ");
            }
            System.out.println();
        }

        /*     ArrayList myList = new ArrayList<>();
        String[] myArray;
        try {
            while (true) {
                myList.add("My String");
            }
        
        } catch (RuntimeException re) {
            System.out.println("aaaa");
        } catch (Exception e) {
            System.out.println("bbbb");
        }
        System.out.println("cccc");*/

        /*    System.out.println("5 + 2 ="+3+4);
        System.out.println("5 + 2 ="+(3+4));*/
    }

}
