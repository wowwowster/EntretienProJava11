package algorithmes.reverseString;

public class ReverseStringTest {
   public static void main(String[] args) {
      String str = "What's going on?";
      System.out.println(ReverseString.reverseIt(str));
   }
}


class ReverseString {
   public static String reverseIt(String str) {

      StringBuffer sb = new StringBuffer(str);
      sb.reverse();
      return sb.toString();

   }
}
