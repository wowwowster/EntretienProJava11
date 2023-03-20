package algorithmes.extraireNombrePairs;

import java.util.ArrayList;

public class MainSansSolution
{
    public static void displayEvenElements(ArrayList liste)
    {

    }

    public static void main(String[] args)
    {
        ArrayList<Integer> liste = new ArrayList<Integer>();

        int[] nbrs =
        {
            1,
            2,
            3,
            4,
            5,
            6,
            7,
            8,
            9
        };

        for (int i = 0; i < nbrs.length; i++)
        {
            liste.add(nbrs[i]);
        }
        displayEvenElements(liste);
    }
}
