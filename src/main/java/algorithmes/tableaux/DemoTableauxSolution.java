package algorithmes.tableaux;

public class DemoTableauxSolution {

    public static void main(String[] args) {

        int[][] data = {
                {10, 20, 30, 40, 50},         // 150
                {10, 20, -1, 40, 50},         // Doit être ignorée
                {100, 200, 300, 400, 500},    // 1500
                {5, -5, 10, 11, 12},          // Doit être ignorée
                {1, 2, 3, 4, 5}               // 15
        };


        for (int lineIndex=0;lineIndex<data.length; lineIndex++) {
            boolean toIgnore = false;
            int sumLine = 0;
            for (int intTampon : data[lineIndex]) {
                if (intTampon > 0)
                    sumLine += intTampon;
                else toIgnore = true;
            }
            if (!toIgnore)
            System.out.printf("La somme de la ligne %d est %d\n", lineIndex, sumLine);
        }

    }
}

