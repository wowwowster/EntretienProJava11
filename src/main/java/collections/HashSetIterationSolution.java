package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetIterationSolution
{

    public static void main(String[] args)
    {
        HashSet<String> hset = new HashSet<String>();

        hset.add("Rahul");
        hset.add("Tim");
        hset.add("Rick");
        hset.add("Harry");

        Iterator<String> it = hset.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
