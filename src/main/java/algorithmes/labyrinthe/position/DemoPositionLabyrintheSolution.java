package algorithmes.labyrinthe.position;

public class DemoPositionLabyrintheSolution {

    public static void main (String[] args) {

        // On définit le tableau : la méthode toCharArray transforme
        // une chaîne de caractères en un tableau de caractères.
        char [][] maze = {
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

        int lineIndex=0;
        int posIndex=0;

        foundpositionBreak :

        for (lineIndex=0; lineIndex<maze.length;lineIndex++ ) {
            for (posIndex=0; posIndex<maze[lineIndex].length;posIndex++ ) {
                if (maze[lineIndex][posIndex]=='S')
                    break foundpositionBreak ;
            }
        }
        System.out.printf("Position de la sortie : ligne %dx position %d\n", ++lineIndex, ++posIndex);
    }
}
