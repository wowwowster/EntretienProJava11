package algorithmes.labyrinthe;

public class DemoLabyrintheSolution {

    public static void main (String[] args) {
        char[][] labyrinthe = {
                "######################################".toCharArray(),
                "#S     #       #             #       #".toCharArray(),
                "###### # # ### # ########### # ### # #".toCharArray(),
                "#      # # # # # #         # #   #####".toCharArray(),
                "### #### # # # # # # # # # # # #     #".toCharArray(),
                "#      # # # # # # ######### ####### #".toCharArray(),
                "# #### # # # # # #             #     #".toCharArray(),
                "# #    # # # #   # ########### # # # #".toCharArray(),
                "# ###### # # # # # # # # # # # # # # #".toCharArray(),
                "#        #   # #           # #   # #D#".toCharArray(),
                "######################################".toCharArray()
        };

        for (char [] line: labyrinthe){
            for(char cell :  line ){
                System.out.print( cell );
            }
            System.out.println();
        }
    }
}
