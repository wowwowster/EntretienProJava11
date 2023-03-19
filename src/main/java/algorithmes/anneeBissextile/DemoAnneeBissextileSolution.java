package algorithmes.anneeBissextile;

import java.util.Scanner;

public class DemoAnneeBissextileSolution {

    public static void main(String[] args) {

        /* pour info, 2024 et2028 sont bissextiles                 */

        try (Scanner scanner = new Scanner(System.in)) {
            //System.out.print("Veuillez saisir une année : ");
            //int year = scanner.nextInt();
            //controleAnneeBissextile(year);
            returnControleAnneeBissextile(2023);
            returnControleAnneeBissextile(2024);
            returnControleAnneeBissextile(2025);
            returnControleAnneeBissextile(2026);
            returnControleAnneeBissextile(2027);
            returnControleAnneeBissextile(2028);
        }
    }

    private static void returnControleAnneeBissextile(int anneeSaisie) {
        if (controleAnneeBissextile(anneeSaisie)) {
            System.out.printf("L'année %d est bissextile\n", anneeSaisie);
        } else {
            System.out.printf("L'année %d n'est pas bissextile\n", anneeSaisie);
        }
    }

    private static boolean controleAnneeBissextile(int anneeSaisie) {
        if (anneeSaisie % 4 != 0)
            return false;
        if (anneeSaisie % 400 == 0)
            return true;
            else if (anneeSaisie % 100 == 0)
                return false;
        return true;
    }
}
