package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapIterationSolution
{
    public static void main(String[] args) {
        HashMap<Integer, String> aHashMap = new HashMap<>();
        aHashMap.put(1, "Rahul");
        aHashMap.put(2, "Tim");
        aHashMap.put(3, "Rick");
        aHashMap.put(4, "Harry");
        Set<Integer> aSet = aHashMap.keySet();
        Iterator it = aSet.iterator();
        while (it.hasNext()) {
            Object cle = it.next(); // tu peux typer plus finement ici
            Object valeur = aHashMap.get(cle); // tu peux typer plus finement ici
        }
    }
}
