package collections;

import java.util.HashMap;
import java.util.Map;

public class UtilisationEntrySolution
{
    public static void main(String[] args)
    {
        final Map<String, String> map = new HashMap<>();

        map.put("rouge", "FF0000");
        map.put("vert", "00FF00");
        map.put("bleu", "0000FF");
        for (final Map.Entry<String, String> entry : map.entrySet())
        {
            final String key = entry.getKey();
            final String value = entry.getValue();

            // Traitement key-value
            System.out.println("key: " + key + " value: " + value);
        }
    }
}
