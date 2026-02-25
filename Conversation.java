// You should **not** update any call signatures in this file
// only modify the body of each function
import java.util.Scanner;

class Conversation implements ConversationRequirements {

  // Attributes 

  /*
    Constructor 
   */
  Conversation() {
  
  }

  /**
   * Starts and runs the conversation with the user
   */
  public void chat() {
    Scanner input = new Scanner(System.in);
    System.out.print("How many rounds? ");
    int rounds = input.nextInt();
    input.nextLine();

    String transcript = "";

    for (int i = 0; i < rounds; i++) {
      String line1 = input.nextLine();
      System.out.println();
      transcript += line1 + "\n";

      String line2 = input.nextLine();
      System.out.println();
      transcript += line2 + "\n";
  }

  /**
   * Prints transcript of conversation
   */

  System.out.println("\nTRANSCRIPT:");
  System.out.print(transcript);
  input.close();

  public void printTranscript() {
  }

  /**
   * Gives appropriate response (mirrored or canned) to user input
   * @param inputString the users last line of input
   * @return mirrored or canned response to user input  
   */
  public String respond(String inputString) {
    String returnString = ""; 
    return returnString; 
  }

  public static void main(String[] arguments) {

    Conversation myConversation = new Conversation();
    myConversation.chat();
    myConversation.printTranscript();

  }
}
