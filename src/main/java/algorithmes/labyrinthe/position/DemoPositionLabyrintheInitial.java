package algorithmes.labyrinthe.position;

public class DemoPositionLabyrintheInitial {

    public static void main(String[] args) {

        // On définit le tableau : la méthode toCharArray transforme
        // une chaîne de caractères en un tableau de caractères.
        //  Si tout se passe bien dans votre programme, vous devriez trouver que la sortie du labyrinthe proposé
        //  est en position 12x3.
        char[][] maze = {
                "######################################".toCharArray(),
                "#     #       #             #        #".toCharArray(),
                "###### # # ### # ########### # ### #D#".toCharArray(),
                "#      # # #S# # #         # #   #####".toCharArray(),
                "### #### # # # # # # # # # # # #     #".toCharArray(),
                "#      # # # # # # ######### ####### #".toCharArray(),
                "# #### # # # # # #             #     #".toCharArray(),
                "# #    # # # #   # ########### # # # #".toCharArray(),
                "# ###### # # # # # # # # # # # # # # #".toCharArray(),
                "#        #   # #           # #   # # #".toCharArray(),
                "######################################".toCharArray()
        };

        int indexY = 0;
        int indexX = 0;
        char cell;

        goBreak:
        for (indexY = 0; indexY < maze.length; indexY++) {
            char[] line = maze[indexY];
            for (indexX = 0; indexX < line.length; indexX++) {
                cell = maze[indexY][indexX];
                if (cell == 'S') {
                    break goBreak;
                }
            }
        }


        System.out.printf("%d %d", indexY, indexX);
    }
}
