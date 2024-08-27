import java.util.*;
import java.io.*;

class HR_map{
    public static void main(String []argh) {
        Scanner in = new Scanner(System.in);

        // Number of entries in the phone book
        int n = in.nextInt();
        in.nextLine();  // Consume the newline character

        // Initialize the HashMap to store the phone book
        HashMap<String, Integer> phoneBook = new HashMap<>();

        // Read entries and store them in the phone book
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();  // Read the name
            int phone = in.nextInt();  // Read the phone number
            in.nextLine();  // Consume the newline character
            phoneBook.put(name, phone);  // Store the name and phone number in the phone book
        }

        // Process the queries
        while (in.hasNext()) {
            String query = in.nextLine();  // Read the query name

            // Check if the name exists in the phone book
            if (phoneBook.containsKey(query)) {
                System.out.println(query + "=" + phoneBook.get(query));  // Print name and phone number
            } else {
                System.out.println("Not found");  // Print "Not found" if not found in the phone book
            }
        }

        in.close();  // Close the scanner
    }
}




