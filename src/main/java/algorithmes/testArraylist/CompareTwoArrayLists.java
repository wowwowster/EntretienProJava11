package algorithmes.testArraylist;

import java.util.ArrayList;
import java.util.List;

public class CompareTwoArrayLists
{

    public static void main(String[] args)
    {

        List<String> lang1 = new ArrayList<String>();
        lang1.add("PHP");
        lang1.add("Java");
        lang1.add("C++");
        lang1.add("Python");

        List<String> lang2 = new ArrayList<String>();
        lang2.add("PHP");
        lang2.add("Java");
        lang2.add("C");
        lang2.add("Python");

        //Stocker la comparaison dans un ArrayList
        ArrayList<String> lang3 = new ArrayList<String>();

        for (String l : lang1)
            lang3.add(lang2.contains(l) ? "TRUE" : "FALSE");

        System.out.println(lang3);

    }
}
