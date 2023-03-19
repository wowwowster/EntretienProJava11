package algorithmes.anneeBissextile;

import java.util.Scanner;

public class DemoAnneeBissextileInitial {

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

        /* résultats attendus =>
                                    L'année 2023 n'est pas bissextile
                                    L'année 2024 est bissextile
                                    L'année 2025 n'est pas bissextile
                                    L'année 2026 n'est pas bissextile
                                    L'année 2027 n'est pas bissextile
                                    L'année 2028 est bissextile
         */
    }

    private static void returnControleAnneeBissextile(int anneeSaisie) {
        if (controleAnneeBissextile(anneeSaisie)) {
            System.out.printf("L'année %d est bissextile\n", anneeSaisie);
        } else {
            System.out.printf("L'année %d n'est pas bissextile\n", anneeSaisie);
        }
    }

    private static boolean controleAnneeBissextile(int anneeSaisie) {
      return true;
    }
}
