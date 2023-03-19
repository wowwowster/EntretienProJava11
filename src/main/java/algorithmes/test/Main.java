package algorithmes.test;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        List<String> languages = new ArrayList<String>();
        languages.add("PHP");
        languages.add("Java");
        languages.add("C++");
        languages.add("Python");
        for (String lang : languages)
        {
            System.out.println(lang);
        }
        languages.add(0, "toto");

    }
}
