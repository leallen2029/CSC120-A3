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

        // Last round
        if (counter == rounds - 1) {
            say("Hmm");
        } 
        else {

            String[] words = response.split(" ");
            StringBuilder reply = new StringBuilder();
            int pronounCount = 0;

            for (String word : words) {

                if (word.equalsIgnoreCase("i")) {
                    reply.append("you");
                    pronounCount++;
                }
                if (word.equalsIgnoreCase("i'm")) {
                    reply.append("you're");
                    pronounCount++;
                }
                else if (word.equalsIgnoreCase("me")) {
                    reply.append("you");
                    pronounCount++;
                }
                else if (word.equalsIgnoreCase("my")) {
                    reply.append("your");
                    pronounCount++;
                }
                else if (word.equalsIgnoreCase("am")) {
                    reply.append("are");
                    pronounCount++;
                }
                else if (word.equalsIgnoreCase("are")) {
                    reply.append("am");
                    pronounCount++;
                }
                else if (word.equalsIgnoreCase("your")) {
                    reply.append("my");
                    pronounCount++;
                }

                else if (word.equalsIgnoreCase("you're")) {
                    reply.append("i'm");
                    pronounCount++;
                }

                else if (word.equalsIgnoreCase("you")) {
                    reply.append("I");
                    pronounCount++;
                }
                else {
                    reply.append(word);
                }

                reply.append(" ");
            }

            if (pronounCount == 1) {
                say(reply.toString().trim() + "?");
            } 
            else {
                if (response.length() < 11) {
                    say("Is that all you got?");
                } 
                else if (response.length() > 50) {
                    say("Wow that is a lot going on, is that all?");
                } 
                else {
                    say("Wanna tell me more?");
                }
            }
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