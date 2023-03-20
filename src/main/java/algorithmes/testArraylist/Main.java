package algorithmes.testArraylist;

import java.util.ArrayList;
import java.util.Collections;
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

        // System.out.println(languages.get(2));
        Collections.sort(languages);
        for (String lang : languages)
        {
            System.out.println(lang);
        }

    }
}
