import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nLINKEDLIST CHALLENGE");
        Scanner input = new Scanner(System.in);
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("\nAvailable actions (select word or letter)");
            System.out.println("(F)orward" +
                    "\n(B)ackwards" +
                    "\n(L)ist Places" +
                    "\n(M)enu" +
                    "\n(Q)uit");
            String choice = input.nextLine();
            switch (choice) {
                case "F", "Forward":
                    break;
                case "B", "Backwards":
                    break;
                case "L", "List":
                    break;
                case "M", "Menu":
                    break;
                case "Q", "Quit":
                    isRunning = false;
                    break;
            }
        }

    }
}