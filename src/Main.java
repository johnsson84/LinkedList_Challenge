import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> cities = new LinkedList<String>();
        cities.add("Göteborg");
        cities.add("Trollhättan");
        cities.add("Mariestad");
        cities.add("Örebro");
        cities.add("Luleå");

        ListIterator here = cities.listIterator(1);

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
                    if (here.nextIndex() == 4) {
                        System.out.println("ListIterator index: " + here.nextIndex());
                        System.out.println("Du är framme vid slut destinationen Luleå.");
                    }
                    else if (here.hasNext()) {
                        System.out.println("ListIterator index: " + here.nextIndex());
                        System.out.println("Du har rest till " + here.next());
                    }
                    else {
                        System.out.println("ListIterator index: " + here.nextIndex());
                        System.out.println("Error");
                    }
                    break;
                case "B", "Backwards":
                    if (here.previousIndex() == 0) {
                        System.out.println("ListIterator index: " + here.previousIndex());
                        System.out.println("Du är hemma i Göteborg.");
                    }
                    else if (here.hasPrevious()) {
                        System.out.println("ListIterator index: " + here.previousIndex());
                        System.out.println("Du har rest tillbaka till " + here.previous());
                    }
                    else {
                        System.out.println("ListIterator index: " + here.previousIndex());
                        System.out.println("Error");
                    }
                    break;
                case "L", "List":
                    for (int i = 0; i < cities.size(); i++) {
                        System.out.println(cities.get(i));
                    }

                    break;
                case "M", "Menu":
                    // Vad ska denna menyn göra?
                    break;
                case "Q", "Quit":
                    isRunning = false;
                    break;
            }
        }

    }
}