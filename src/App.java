
/**
    * You are going to write code to store a list of participant names for a 
    * local event. You will create an ArrayList for Strings, then accept user 
    * input to add names to that ArrayList. There will be additional modifications 
    * you can make:

    * B Level:
    * Accept input from users and add names to the ArrayList. (done)

    * B+ Level:
    * Accept names from users and stop accepting input when the user enters "end". (done) 
    * After this, the full list of names should be printed, one name per line.

    * A- Level:
    * Complete B and B+. Additionally, do not allow duplicates. If the user enters a 
    * name that already exists, tell them that the name has already been entered, but 
    * continue accepting new names.

    * A+ Level:
    * Complete B and B+. Modify A- so that when a duplicate name is entered, the user 
    * is asked whether they want to delete the existing name. If they enter "yes", the 
    * name is removed from the list. If they type anything else, the duplicate name is 
    * ignored, and no change is made to the list.
*/
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> participantNames = new ArrayList<>();

        while (true) {
            System.out.println("Enter a participants name:");
            String name = scanner.nextLine();
            if (name.equals("end")) {
                break;
            }
            if (participantNames.contains(name)) {
                System.out.println("This name already exsits. Do you want to remove it?");
                String response = scanner.nextLine();

                if (response.equals("yes")) {
                    participantNames.remove(name);

                } else if (response.equals("no")) {
                }
            } else {
                participantNames.add(name);
            }

        }

        for (String name : participantNames) {
            System.out.println(name);
        }
    }
}