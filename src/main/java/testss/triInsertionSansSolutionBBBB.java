package testss;

public class triInsertionSansSolutionBBBB {

    public static void main(String[] args) {
        int tableau[] = {1, 6, 4, 6, 2, 0, 1, 5};

        triInsertion(tableau);

        for (int i = 0; i < tableau.length; i++) {
            System.out.print(tableau[i]);
        }
    }

    static void triInsertion(int[] tab) {
        int valTampon, incrementStart = 0, incrementEnd = 1, position = 0;
        position = incrementStart;
        while (position<tab.length-1) {
            if (tab[position] > tab[position+1]) {
                valTampon = tab[position+1];
                tab[position+1] = tab[position];
                tab[position] = valTampon;
                position=0;
            } else {
                position++;
            }
        }
    }

}
