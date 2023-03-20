package algorithmes.extraireNombrePairs;

import java.util.ArrayList;

public class MainAvecSolution
{
    public static void displayEvenElements(ArrayList liste)
    {
        for (int i = 0; i < liste.size(); i++)
        {
            if ((int) liste.get(i) % 2 == 0)
            {
                System.out.print(liste.get(i) + " ");
            }
        }
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