import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;


public class FindingsList {
    public FindingsList() throws InterruptedException {
        Thread.sleep(500);
        System.out.println("Welcome back! Hope you had an exciting and eventful expedition!");

        ArrayList<String> rockList = new ArrayList<String>();

        rockList.add("rock");
        rockList.add("weird rock");
        rockList.add("smooth rock");
        rockList.add("not rock");

        System.out.println("Rock data downloaded.");
        System.out.println(rockList);

        System.out.println("Hold up! That last item is not a rock. We need to delete that one from the list");

        rockList.remove("not rock");

        System.out.println(rockList);

        Thread.sleep(1000);

        HashMap<String, String> fossils = new HashMap<>();

        fossils.put("Bird", "The fossil has wings implying it was capable of flight");
        fossils.put("Fish", "The fossil is vaguely fish shaped implies there was once water");
        fossils.put("Tooth", "The tooth from an unknown fossil");

        System.out.println("Fossil data downloaded");

        System.out.println("Which of the fossils would you like to learn more about (Bird, Fish, or Tooth)?");

        Scanner input = new Scanner(System.in);

        String fossilChoice = input.nextLine();

        if (fossilChoice.equalsIgnoreCase("Bird")) {
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossils.get(fossilChoice));
        } else if (fossilChoice.equalsIgnoreCase("Fish")) {
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossils.get(fossilChoice));
        } else if (fossilChoice.equalsIgnoreCase("Tooth")) {
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossils.get(fossilChoice));
        }

        Thread.sleep(700);

        HashSet<String> specialSupplies = new HashSet<>();

        specialSupplies.add("Reality Distortion Taser");
        specialSupplies.add("Teddy bear");
        specialSupplies.add("Laser gun");

        System.out.println("Supplies Before Expedition");

        //print special supplies
        Iterator itr = specialSupplies.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        specialSupplies.remove("Teddy bear");

        System.out.println("Supplies After Expedition");

        Iterator itrTwo = specialSupplies.iterator();


        while (itrTwo.hasNext()) {
            System.out.println(itrTwo.next());
        }







    }
}
