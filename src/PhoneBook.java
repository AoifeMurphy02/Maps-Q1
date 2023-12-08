import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    //Create a new project (Map-Q2a) to implement a simple PhoneBook container class.
    //The class will store “name”->”number” mappings with types (String->String) in a
    //Map.
    //e.g. “Tom” -> “042-9876542”, “Annie”->”087-9876234” and so on.
    //The PhoneBook container class will provide the following:


    Map<String, String> phoneBookMap;
    // Constructor
    public PhoneBook() {
        phoneBookMap = new HashMap<>();
    }
    // add( name, number )
    public void add(String name, String number){
            phoneBookMap.put(name,number);
    }
    // remove( name )
    public void remove(String name){
        phoneBookMap.remove(name);
    }
    // findPhoneNumber( name ) to get corresponding number
    public String findPhoneNumber(String name){
     return phoneBookMap.get(name);
    }
    // displayPhoneBook() – to show all contacts in ascending name order.
    public void displayPhoneBook() {
        System.out.println("PhoneBook Contacts:");
        for (Map.Entry<String, String> entry : phoneBookMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
