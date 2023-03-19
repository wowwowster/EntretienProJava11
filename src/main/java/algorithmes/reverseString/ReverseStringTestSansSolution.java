package algorithmes.reverseString;

public class ReverseStringTestSansSolution {
   public static void main(String[] args) {
      String str = "What's going on?";
      // System.out.println(str);
      System.out.println(reverseItBB(str));
   }

   static String reverseItBB (String chaine) {
      StringBuffer sb = new StringBuffer(chaine);
      return sb.reverse().toString();
   }

}
