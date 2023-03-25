package algorithmes.tableaux;

import com.google.common.collect.TreeMultiset;

public class Main
{
    public static void main(String[] args)
    {
        TreeMultiset<String> treeMultiset = TreeMultiset.create();

        // Ajouter des éléments
        treeMultiset.add("a");
        treeMultiset.add("b");
        treeMultiset.add("a");
        treeMultiset.add("c");

        // Récupérer les éléments triés
        System.out.println(treeMultiset); // Affiche "[a x 2, b, c]"

        // Récupérer le sous-ensemble des éléments "a" à "b"
        //System.out.println(treeMultiset.subMultiset("a", "b")); // Affiche "[a x 2, b]"
    }
}