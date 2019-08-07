
import java.lang.Math;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
  public static void main (String[] args) throws InterruptedException{
    System.out.println("\n\n Feature Task1:");
    System.out.println(pluralize("dog", 1));
    System.out.println(pluralize("cat", 2));
    System.out.println(pluralize("turtle", 0));
    System.out.println("\n\n Feature Task2:");
    flippingCoins(3);
    System.out.println("\n\n Feature Task3:");
    CommandLineClock();

  }

  public static String pluralize(String word, int num) {
    if (num < 0) {
      return "Invalid number!";
    } else if (num == 1) {
      return "I own " + num + " " + word + ".";
    } else {
      return "I own " + num + " " + word + "s.";
    }
  }

  public static void flippingCoins(int num) {
    if (num <= 0)  {
      System.out.println("Invalid input!");
      return;
    } 
    int counter = 0;
    int totalFlips = 0;
    while (totalFlips != num) {
      if (Math.random() < 0.5) {
        totalFlips = 0;
        counter++;
        System.out.println("tails");
      } else {
        counter++;
        totalFlips++;
        System.out.println("heads");
      }
    }
    
  if (counter == 1) {
    System.out.println("It took " + counter + " flip to flip 1 head in a row.");
  } else {
    System.out.println("It took " + counter + " flips to flip " + totalFlips + " heads in a row.");
  }
  }

  public static void CommandLineClock() throws InterruptedException {
    while (true) {
      LocalDateTime now = LocalDateTime.now();
      DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm:ss");
      String formatDateTime = now.format(format);
      System.out.println(formatDateTime);
      Thread.sleep(1000);
    }
  }

  
}