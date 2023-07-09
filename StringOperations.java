
public class StringOperations{
       public static void main(String[] args){
              String str = new String ("I study Basic Java!");

              printLastCharacter(str);
              checkSubstring(str);
              replaceCharacter(str);
              convertToUpperCase(str);
              convertToLowerCase(str);
              substringExample(str);
       }
       public static void printLastCharacter(String str){
              char lastChar = str.charAt(str.length() - 1);
              System.out.println("Last character: " + lastChar);
       }
       public static void checkSubstring(String str){
              boolean containsJava = str.contains("Java");
              System.out.println("Contains 'Java': " + containsJava);
       }
       public static void replaceCharacter(String str) {
              String replacedStr = str.replace('a', 'o');
              System.out.println("Replaced string: " + replacedStr);
       }
       public static void convertToUpperCase(String str){
              String UpperCaseStr = str.toUpperCase();
              System.out.println("Uppercase string: " + UpperCaseStr);
       }
       public static void convertToLowerCase(String str){
              String LowerCasestr = str.toLowerCase();
              System.out.println("Lowercase string: " + LowerCasestr);
       }

       public static void substringExample(String str){
              String substring = str.substring(12);
              System.out.println("Substring: " + substring);
       }
}
