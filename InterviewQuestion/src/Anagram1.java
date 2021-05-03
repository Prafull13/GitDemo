import java.util.Arrays;

class Anagram1 {
  public static void main(String[] args) {
    String str1 = "ate";
    String str2 = "eat";
    
    str1 = str1.toLowerCase();
    str2 = str2.toLowerCase();

    // check if length is same
    if(str1.length() == str2.length()) {

      // convert strings to char array
      char[] s1 = str1.toCharArray();
      char[] s2 = str2.toCharArray();

      // sort the char array
      Arrays.sort(s1);
      Arrays.sort(s2);

      // if sorted char arrays are same
      // then the string is anagram
      boolean result = Arrays.equals(s1, s2);

      if(result) {
        System.out.println(str1 + " and " + str2 + " are anagram.");
      }
      else {
        System.out.println(str1 + " and " + str2 + " are not anagram.");
      }
    }
    else {
      System.out.println(str1 + " and " + str2 + " are not anagram.");
    }
  }
}