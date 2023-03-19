package algorithmes.findDuplicates;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicatesSansSolution
{
    static int[] tabInt = new int[13];

    static void init()
    {
        for (int index = 0; index < tabInt.length; index += 1)
        {
            tabInt[index] = (int) (10 * Math.random());
        }
    }

    public static void main(String[] args)
    {
        init();
        int end = tabInt.length;
        Set<Integer> vHashSetTampon = new HashSet<Integer>();
        Set<Integer> vHashSetFinal = new HashSet<Integer>();
        for (int index = 1; index < end; index++)
        {
            if (!vHashSetTampon.add(tabInt[index])) vHashSetFinal.add(tabInt[index]);
        }
        int[] tabIntResult = new int[vHashSetFinal.size()];
        int vIndex = 0;
        for (Integer vInteger : vHashSetFinal)
        {
            tabIntResult[vIndex++] = vInteger;
        }
        System.out.println(Arrays.toString(tabInt));
        System.out.println(Arrays.toString(tabIntResult));
    }
}
