import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //In the main method:
        //a) Create a HashMap called countyCodeMap to store a mapping between a county
        HashMap<String, String> countyCodeMap = new HashMap<>();
        //numberplate code and the county name. (e.g. “LH” -> “Louth”, “D” -> “Dublin”)
        //Note that both key and value are of type String.
        //b) Populate the map with county codes using put(k,v)
        countyCodeMap.put("LH","Louth");
        countyCodeMap.put("D", "Dublin");
        countyCodeMap.put("C", "Cork");
        countyCodeMap.put("MN","Monaghan");
        countyCodeMap.put("KK","Kilkenny");
        //c) Write a loop that repeatedly asks the user for a county code, and displays the county
        //name if found, and otherwise, displays “County code not found”. [ use get(key) ]
        Scanner scanner = new Scanner(System.in);

        // Loop to repeatedly ask the user for a county code
        while (true) {
            System.out.println("Enter county code (or 'exit' to stop):");
            String in = scanner.nextLine();

            if (in.equalsIgnoreCase("exit")) {
                break;
            }

            String countyName = countyCodeMap.get(in);

            if (countyName != null) {
                System.out.println("County name: " + countyName);
                break;
            } else {
                System.out.println("County code not found");
            }
        }
        scanner.close();
        //d) Write a loop that repeatedly asks the user for a county name, and returns “Found”
        //or “Not Found” depending on whether the county is in the map or not.
        //e) Write a function displayMap() that accepts the map as an argument and uses a loop
        //to display all the mappings from the map, showing both key and value.
    }
}