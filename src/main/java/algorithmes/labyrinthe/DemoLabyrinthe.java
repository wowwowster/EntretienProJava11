package algorithmes.labyrinthe;

public class DemoLabyrinthe
{
    public static void main(String[] args)
    {
        char[][] labyrinthe =
        {
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
        for (char[] line : labyrinthe)
        {
            for (char c : line)
            {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
