import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ArrayListChallenge {

 static   ArrayList<String> groceries = new ArrayList<>(List.of("Apple", "Tomato"));
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean flag = true;


        while (flag) {
            printActions();
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1 -> addItems(groceries);
                case 2 -> removeItems(groceries);
                default -> flag = false;


            }
            groceries.sort(Comparator.naturalOrder());
            System.out.println(groceries);

        }

    }

    public static void printActions() {

        String textBlock = """
                Available actions:
                                
                0 - to shutdown
                                
                1 - to add item(s) to list (comma delimited list)
                                
                2 - to remove any items (comma delimited list)
                                
                Enter a number for which action you want to do:""";
        System.out.println(textBlock + " ");
    }


    private static void addItems(ArrayList<String> groceries) {

        System.out.println("Add item(s) [Separate items by comma:]");
        String[] items = scanner.nextLine().split(",");
        //groceries.addAll(List.of(items));
        for (String element : items) {
            String trimmed = element.trim();
            if (groceries.indexOf(items) < 0) {
                groceries.add(trimmed);
            }
        }
    }

    private static void removeItems(ArrayList<String> groceries) {

        System.out.println("Remove item(s) [Separate items by comma:]");
        String[] items = scanner.nextLine().split(",");
        //groceries.addAll(List.of(items));
        for (String element : items) {
            String trimmed = element.trim();
            if (groceries.indexOf(items) < 0) {
                groceries.remove(trimmed);
            }
        }
    }

}