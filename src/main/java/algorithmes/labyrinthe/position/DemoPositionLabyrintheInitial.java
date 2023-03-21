package algorithmes.labyrinthe.position;

public class DemoPositionLabyrintheInitial
{

    public static void main(String[] args)
    {

        // On définit le tableau : la méthode toCharArray transforme
        // une chaîne de caractères en un tableau de caractères.
        //  Si tout se passe bien dans votre programme, vous devriez trouver que la sortie du labyrinthe proposé
        //  est en position 12x3.
        char[][] maze =
        {
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

    }
}
