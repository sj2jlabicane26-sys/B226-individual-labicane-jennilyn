
package day13.activity;
import java.util.Scanner;
public class Activity9_Labicane {
    public static void main(String[] args) {
        
//1. Research Phase
//Each student will research the following Java String methods:
//contains()
//endsWith()
//startsWith()
//indexOf()
//isEmpty()
//trim()
//replace()
//toCharArray()
//nextLine().charAt()
//valueOf()
       
//For each method, students must write:
//A short description of what the method does.
//The method’s syntax.
//A simple code example that demonstrates its use.


// 1.contains 
// public boolean contains(CharSequence sequence)
//    A short description of what the method does.
// method checks whether a specific sequence of characters exists within a given string.
// It returns true if the sequence is found, and false if it is not.
// Syntax: stringName.contains("text");

        // Successful match                             
        String fullName = "Jennilyn Labicane"; // 
        boolean name = fullName.contains("Jen"); // boolean variableName = stringName.contains("substring");
        System.out.println(name); // Outputs: true
        
        
        // Case-sensitivity check
        String nickName = "Gelyn";
        boolean nick = nickName.contains("Jen"); 
        System.out.println(nick); // Outputs: false
        
// 2. endsWith()
//public boolean endsWith(String suffix)
//    A short description of what the method does.    
// method is a built-in function of the String class used to check
// if a string ends with a specific suffix. It performs a character-by-character comparison
// from the end of the string and returns a boolean value (true or false)  
// Syntax: stringName.endsWith("suffix");       
        String lastName = "Jennilyn Labicane"; // 
         // Successful match
        System.out.println(lastName.endsWith("Labicane")); //true  
        System.out.println(lastName.endsWith("cane")); // true /last-partial
        
        // Case-sensitivity check
        System.out.println(lastName.endsWith("labicane")); // false / lowercase
        System.out.println(lastName.endsWith("Labi")); // false /first-partial
  
// 3. startsWith()
// public boolean startsWith(String prefix, int toffset)
//    A short description of what the method does. 
//the startsWith() method of the String class checks whether a string begins
//with a specified prefix. It returns a boolean value: true if the string matches the prefix,
//and false otherwise.
// Case-Sensitivity: The method treats uppercase and lowercase letters differently
// (e.g., "Jen" does not match "jen").
// It looks for an exact literal character match.
// Syntax: stringName.startsWith("prefix"); or boolean result = stringName.startsWith("prefix");
        
        String fullNam = "Jennilyn M. Labicane";
        
        // 1. Standard check (starts at index 0)
        boolean check1 = fullNam.startsWith("Jennilyn");  // true
        boolean check2 = fullNam.startsWith("jennilyn");  // false (case sensitivity)
        boolean check3 = fullNam.startsWith("M");  // false
        // Print the result
        System.out.println("Starts with 'Jennilyn': " + check1);
        System.out.println("Starts with 'jennilyn': " + check2);
        System.out.println("Starts with 'M': " + check3);
        
        // 2. Using an offset index
        // The word "Java" starts at index 11
        boolean checkOffset1 = fullNam.startsWith("Labicane", 12);  // true
        boolean checkOffset2 = fullNam.startsWith("M", 9); // true

        System.out.println("Starts with 'Labicane' at index 12: " + checkOffset1);
        System.out.println("Starts with 'M' at index 9: " + checkOffset2);
     
// 4. indexOf()
//    A short description of what the method does.
//The indexOf() method in Java returns the 0-indexed position of the first occurrence
//of a specified character or substring within a string.                    
//If the character or substring is not found, the method returns -1.
//Spaces are treated as characters and have their own index positions.
// Syntax: Find a character  stringName.indexOf('character'); 
// Syntax: Find a substring  stringName.indexOf("substring");
// int position = stringName.indexOf("substring");

                        //  0123456789 so on and so forth
             String fullN = "Jennilyn Labicane";
 
// The 4 Overloads of indexOf()                       
        // 1. Find a character
        int index1 = fullN.indexOf('J'); 
        System.out.println(index1); // Outputs:0 

        // 2. Find a character starting from a specific index
        int index2 = fullN.indexOf('y', 2); 
        System.out.println(index2); // Outputs: 6 (skips letter before 2)

        // 3. Find a substring /int position = stringName.indexOf("substring");
        int index3 = fullN.indexOf("Lab"); 
        System.out.println(index3); // Outputs: 9

        // 4. Missing element returns -1
        int index4 = fullN.indexOf("M"); 
        System.out.println(index4); // Outputs: -1
    
// 5.isEmpty()
//    A short description of what the method does.
//For strings, isEmpty() evaluates to true only if the text length equals 0 (e.g., "")
// Syntax / stringName.isEmpty();
        
        String emptyText = "";
        String spaceText = "   ";

        System.out.println(emptyText.isEmpty()); // Returns true
        System.out.println(spaceText.isEmpty()); // Returns false



// 6. trim()
//    A short description of what the method does. 
// removes all leading and trailing whitespace characters from a string       
// Syntax / stringName.trim();  or String newString = stringName.trim();    
        String original = "   Jennilyn Labicane   ";
        String trimmed = original.trim();

        System.out.println("Original:" + "'" + original + "'"); 
        // Output:'  Jennilyn Labicane   '
        
        System.out.println("Trimmed:" + "'"+ trimmed + "'");  
        // Output:'Jennilyn Labicane'

// 7. replace()
//    A short description of what the method does. 
//replaces every occurrence of a specific character or  
//substring in a string with a new character or substring
//returns a brand-new string with the updates applied
// Syntax / Replace a character: stringName.replace('oldChar', 'newChar');
// Syntax / Replace a substring: stringName.replace("oldText", "newText");
        
        String nicknam = "Gelyn";
        // 1. Replacing Characters /Replace 'G' character with 'J'
        String result = nicknam.replace('G', 'J'); // Use single quotes (' ') to target literal character data.

        System.out.println(result); 
        // Output: Jelyn
        
        
        // 2. Replacing Substrings
        String text = " Hello! I'm Jennilyn Labicane ";
        // Replace all occurrences of "Jennilyn" with "Gelyn"
        String  outcome = text.replace("Jennilyn", "Gelyn");

        System.out.println(outcome); 
        // Output: I'm Gelyn Labicane
        
// 8.toCharArray()
//    A short description of what the method does.
// used to convert a string into a newly allocated character array (char[])
// Syntax: char[] arrayName = stringName.toCharArray();

          String Nam = "Jennilyn";
        
        // Convert String to char array
        char[] charArray = Nam.toCharArray();
        
        // Iterate and print each character
        for (char chr : charArray) {
            System.out.println(chr);
        }

// 9.nextLine().charAt()
//    A short description of what the method does.
// chaining scanner.nextLine().charAt(0) is used to read a single character
// from the user input by grabbing an entire line of text
// as a string and extracting the very first character
// Syntax : char variableName = scannerName.nextLine().charAt(0);
         Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a word or character: ");
        // Extracts the very first character of the entered line
        char letter = scanner.nextLine().charAt(0); 
        
        System.out.println("The first character is: " + letter);
        scanner.close();
        
// 10.valueOf()
// valueOf() is a static utility method used for data type conversion
// Syntax : String variableName = String.valueOf(value);       
        //Syntax / String.valueOf(value)
       
        // example 1
        int age = 17;

        String old = String.valueOf(age);
        System.out.println(old + " years old");

        // example 2
         double grade = 99.99;

        String reslt = String.valueOf(grade);

        System.out.println(reslt);

         // example 3
         boolean passed = true;

        String status = String.valueOf(passed);

        System.out.println(status);
        
        // example 4
        
        String number = "90";

        Integer value = Integer.valueOf(number); // WrapperClass.valueOf(value)

        System.out.println(value + 10);
       
        
// 4 . Stretch Goal 🌟- After completing the above;
//
//Write a Java program that performs the following tasks using the given string:  
//                  String country = "Philippines";  
//Display the first and last character of the string.
//Count and display how many times the character "P/p" appears in the string.
//Count and display the total number of vowels (a, e, i, o, u) in


        String country = "Philippines";

        // 1. Display the first and last character of the string
        char firstChar = country.charAt(0);
        char lastChar = country.charAt(country.length() - 1);

        System.out.println("Country: " + country);
        System.out.println("First Character: " + firstChar);
        System.out.println("Last Character: " + lastChar);

        // 2. Count how many times 'P' or 'p' appears in the string
        int pCount = 0;

        for (int i = 0; i < country.length(); i++) {
            char chr = country.charAt(i);

            if (chr == 'P' || chr == 'p') {
                pCount++;
            }
        }

        System.out.println("Number of P/p: " + pCount);

        // 3. Count the total number of vowels
        int vowelCount = 0;

        for (int i = 0; i < country.length(); i++) {
            char ch = Character.toLowerCase(country.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }

        System.out.println("Total Number of Vowels: " + vowelCount);




    }
        
       
        
    }
    

