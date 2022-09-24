
public class MainApp {
  public static void main(String[] args) {
    countPunctuations();
  }

  public static void countCharacters() {
    String str = "The best of both worlds";
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) != ' ')
        count++;
    }
    System.out.println("Total Chars : " + count);
  }

  public static void countPunctuations() {
    String str = "!!!!!He said, 'The mailman loves you.' I heard it with my own ears.";
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == '!' ||
          str.charAt(i) == ',' ||
          str.charAt(i) == ';' ||
          str.charAt(i) == '.' ||
          str.charAt(i) == '?' ||
          str.charAt(i) == '-' ||
          str.charAt(i) == '\'' ||
          str.charAt(i) == '\"' ||
          str.charAt(i) == ':') {
        count++;
      }
    }
    System.out.println("Total Punctuations : " + count);

  }
}
