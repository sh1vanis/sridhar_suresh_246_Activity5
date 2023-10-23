import java.util.Scanner;
import java.util.ArrayList;

class MadLibs {
  
  public static String usersPrompt(int promptNumber){

    String prompt = null;
    
    if (promptNumber == 1){
      prompt = "It as a *, cold November day. I woke up to the * smell of * roasting in the * downstairs. I * down the stairs to see if I could help * the dinner. My mom said, \"See if * needs a fresh *.\" So I carried a tray of glasses full of * into the * room. When I got there, I couldn't believe my *! There were * on the *!"; 
    }
      
    else if (promptNumber == 2){
      prompt = "There are many * ways to choose a/an * to read. First, you could ask for recommendations from your friends and *. Just don’t ask Aunt * - she only reads * books with * - ripping goodness on the cover. If your friends and family are no help, try checking out the * review in The * Times. If the * featured there are too * for your taste, try something a little more low- *, like *: The * magazine, or * magazine. You could also choose a book the * - fashioned way. Head to your local library or * and browse the shelves until something catches your *. Or, you could save yourself a whole lot of * trouble and log on to www.bookish.com, the * new website to * for books! With all the time you’ll save not having to search for * you can read * more books!";
      }
      
    else {
      prompt = "If you are traveling in * and find yourself having to cross a piranha-filled river. Here's how to do it *: - Piranhas are more * during the day, so cross the river at night. - Avoid areas with netter* traps- piranhas may be * there looking to * them! - When * the river, swim *. You don’t want to wake them up and make them *! - Whatever you do, If you have an open wound, try to find another way to get back to the *. Piranhas are attracted to fresh * and will most likely take a bite out of your * if you * in the water!";
      }
    
      return prompt;
  }


  public static String[] usersInputs(int promptNumber, String structured){
    String[] inputs = null;
    
    if (structured.equals("yes")){
      if (promptNumber == 1){
          inputs = new String[] {"adjective", "adjective", "type of bird", "room in a house", "verb(past tense)", "verb", "relative's name", "noun", "a liquid", "verb ending in -ing", "part of the body (plural)", "plural noun", "verb ending in -ing", "noun"};
        }
        
      else if (promptNumber == 2){
          inputs = new String[] {"adjectives", "noun", "plural noun", "person in room(female)", "adjectives", "article of clothing", "noun", "a city", "plural noun", "adjective", "part of the body",  "letter of the alphabet", "celebrity", "plural noun", "adjectives", "a place", "part of the body", "adjective", "adjective", "verb", "plural noun", "number"};
        }
        
      else{
          inputs = new String[] {"foreign country", "adverb", "adjective", "animal", "verb ending in \"ing\"", "verb", "verb ending in \"ing\"", "adverb", "adjective", "a place", "type of liquid", "part of the body", "verb"};
      }
      
    }
    else {
      if (promptNumber == 1){
          inputs = new String[] {"the first word", "the second word", "the third word", "the fourth word", "the fifth word", "the sixth word", "the seventh word", "the eigth word", "the ninth word", "the tenth word", "the eleventh word", "the twelfth word", "the thirteenth word", "the fourteenth word"};
      }
        
      else if (promptNumber == 2){
        inputs = new String[] {"the 1st word ", "the 2nd word", "the 3rd word", "the 5th word", "the 6th word", "the 7th word", "the 8th word", "the 9th word", "the 10th word", "the 11th word", "the 12th word",  "the 13th word", "the 14th word", "the 15th word", "the 16th word", "the 17th word", "the 18th word", "the 19th word", "the 20th word", "the 21st word", "the 22nd word", "the 23rd word"};
      }
        
      else {
        inputs = new String[] {"the 1st word", "the 2nd word", "the 3rd word", "the 4th word", "the 5th word", "the 6th word", "the 7th word", "the 8th word", "the 9th word", "the 10th word", "the 11th word", "the 12th word", "the 13th word"};
      }
      
      }
        return inputs;
    
    }


  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);
    System.out.println("What prompt do you want? ");
    int promptChosen = sc.nextInt();
    System.out.println("Do you want it to be structured(\"yes\") or random(\"no\")? ");
    String randomization = sc2.nextLine();
    
    String theirPrompt = (usersPrompt(promptChosen));
    String[] getInputs = (usersInputs(promptChosen, randomization));

    
    ArrayList<String> words = new ArrayList<String>();
    for (int i =0; i<getInputs.length; i++){
      Scanner sc3 = new Scanner(System.in);
      System.out.println("Enter a " + getInputs[i] + ": ");
      String input = sc3.nextLine();
      words.add(input);
    }
    
    for (String word : words) {
      int index = theirPrompt.indexOf("*");
      String string1 = theirPrompt.substring(0, index);
      String string2 = theirPrompt.substring(index + 1, theirPrompt.length());
      theirPrompt = string1 + word + string2;
      
    }
    System.out.println(theirPrompt);
  }
}