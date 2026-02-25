// You should **not** update any call signatures in this file
// only modify the body of each function
import java.util.ArrayList;
import java.util.Scanner;

class Conversation implements ConversationRequirements {

  private Scanner input;
  private ArrayList<String> transcript;

  Conversation() {
    input = new Scanner(System.in);
    transcript = new ArrayList<String>();
  }

  // prints + stores
  private void say(String text) {
    System.out.println(text);
    transcript.add(text);
  }

  // reads + stores
  private String hear() {
    String s = input.nextLine();
    transcript.add(s);
    return s;
  }

  public void chat() {
    System.out.print("How many rounds? ");
    int rounds = input.nextInt();
    input.nextLine();

  say("Hi I'm Landree Bot, what's up?");

    int counter = 0;
    while (counter < rounds) {
      String response = hear();
      if (response.length() < 11) {
        say("Is that all you got?");
      } else if (response.length() > 50) {
        say("Wow that is a lot going on, is that all?");
      } else {
        say("Wanna tell me more?");
      }

      counter++;
    }
  }

  public void printTranscript() {
    System.out.println("\nTRANSCRIPT:");
    for (String line : transcript) {
      System.out.println(line);
    }
    input.close();
  }

  public String respond(String inputString) {
    return ""; // you can ignore this for now if not needed
  }

  public static void main(String[] arguments) {
    Conversation myConversation = new Conversation();
    myConversation.chat();
    myConversation.printTranscript();
  }
}