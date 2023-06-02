import java.util.Scanner;

public class MarsExpedition {
    public MarsExpedition(){
        Scanner input = new Scanner(System.in);
        System.out.println("Initializing Mars Expedition...");

        try {
            Thread.sleep(1000); // Delay for 1 second
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Calibrating red space rocks and stuff...");

        try {
            Thread.sleep(2000); // Delay for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Generating operational game mechanics...");

        try {
            Thread.sleep(2000); // Delay for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Optimizing complex Martian interactions...");

        try {
            Thread.sleep(2000); // Delay for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Syncing multidimensional realities...");

        try {
            Thread.sleep(2000); // Delay for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Welcome user
        System.out.println("Welcome to Mars Expedition! What is your name?");

        String name = input.nextLine();

        System.out.println(String.format("Hi, %s! Welcome to the Expedition prep program. Are you ready to head out into the new world? Type Y or N", name));

        String response = input.nextLine();

        if(response.equalsIgnoreCase("Y")){
            System.out.println("I knew you would say that. You are a team leader for a reason.");
        } else {
            System.out.println("Too bad you are team leader. You have to go.");
        }

        System.out.println("How many people would you like to join your team?");

        int teamSize =  input.nextInt();
        input.nextLine();

        if(teamSize > 2){
            System.out.println("That’s way to many people. We can only send 2 more members");
            teamSize = 2;
        } else if (teamSize < 2){
            System.out.println("That's not enough people! We need you to add 2 more members.");
            teamSize = 2;
        } else {
            System.out.println("That's a perfect amount of people to join your team!");
        }

        System.out.println("You are allowed to bring one snack with you. What do you want to bring?");

        String snack = input.nextLine();

        System.out.println(String.format("Nice choice, you will be bringing a %s with you.", snack));

        System.out.println("Now please choose your vehicle. You have the choice of 3 vehicles" +
                "\nA: A Mars Rover" +
                "\nB: A Mars Helicopter" +
                "\nC: A Toyota Prius");
        String vehicleChoice = input.nextLine();

        if (vehicleChoice.equalsIgnoreCase("A")) {
            vehicleChoice = "a Mars Rover";
        } else if (vehicleChoice.equalsIgnoreCase("B")) {
            vehicleChoice = "a Mars Helicopter";
        } else if (vehicleChoice.equalsIgnoreCase("C")) {
            vehicleChoice = "a Toyota Prius";
        } else {
            vehicleChoice = "your feet";
        }

        System.out.println("Your expedition team is now ready" +
                "\nLed by " + name + " with " + teamSize + " teammates." +
                "\nTo explore the surface of Mars using " + vehicleChoice + "." +
                "\nExploration team heads out in" +
                "\n5...." +
                "\n4...." +
                "\n3...." +
                "\n2...." +
                "\n1...." +
                "\nGO GO GO!");



    }
}
