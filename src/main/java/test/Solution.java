package test;

public class Solution
{

    public static void main(String[] args)
    {
        int entier1 = Integer.parseInt(args[0]);
        int entier2 = Integer.parseInt(args[1]);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        System.out.println(Integer.valueOf(solveMeFirst(entier1, entier2)).toString());
    }

    public static int solveMeFirst(int aFirstValue, int aSecondValue)
    {
        return aFirstValue + aSecondValue;
    }
}