public class Main {
  public static void main (String[] args) {
    System.out.println(Pluralize("dog", 1));
    System.out.println(Pluralize("cat", 2));
    System.out.println(Pluralize("turtle", 0));
  }

  public static String Pluralize(String word, int num) {
    if (num < 0) {
      return "Invalid number!";
    } else if (num == 1) {
      return "I own " + num + " " + word + ".";
    } else {
      return "I own " + num + " " + word + "s.";
    }
  }

  
}