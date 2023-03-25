package tris;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;

public class TrierSurLesValeursDuneHashmapSolution
{

    public static void main(String[] args)
    {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C++");
        map.put(4, "JavaScript");

        /** on trie la liste des fabricants */

        // Ajout des entrées de la map à une liste
        final List<Entry<Integer, String>> entries = new ArrayList<>(map.entrySet());

        // Tri de la liste sur la valeur de l'entrée
        Collections.sort(entries, Entry.comparingByValue());

        LinkedHashMap vLK = new LinkedHashMap<Integer, String>();
        // Affichage du résultat
        for (final Entry<Integer, String> entry : entries)
        {
            vLK.put(entry.getKey(), entry.getValue());
        }

        System.out.println(vLK);
    }
}
