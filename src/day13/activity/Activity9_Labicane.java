
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
        
//        // Successful match
//        String fullName = "Jennilyn Labicane";
//        boolean name = fullName.contains("Jen"); 
//        System.out.println(name); // Outputs: true
//        
//        
//        // Case-sensitivity check
//        String nickName = "Gelyn";
//        boolean nick = nickName.contains("Jen"); 
//        System.out.println(nick); // Outputs: false
        
// 2. endsWith()
//public boolean endsWith(String suffix)
//    A short description of what the method does.    
// method is a built-in function of the String class used to check
// if a string ends with a specific suffix. It performs a character-by-character comparison
// from the end of the string and returns a boolean value (true or false)  
       
//        String lastName = "Jennilyn Labicane";
//         // Successful match
//        System.out.println(lastName.endsWith("Labicane")); //true
//        System.out.println(lastName.endsWith("cane")); // true /last-partial
//        
//        // Case-sensitivity check
//        System.out.println(lastName.endsWith("labicane")); // false / lowercase
//        System.out.println(lastName.endsWith("Labi")); // false /first-partial
  
// 3. endsWith()
// public boolean startsWith(String prefix, int toffset)
//    A short description of what the method does. 
//the startsWith() method of the String class checks whether a string begins
//with a specified prefix. It returns a boolean value: true if the string matches the prefix,
//and false otherwise.
// Case-Sensitivity: The method treats uppercase and lowercase letters differently
// (e.g., "Jen" does not match "jen").
// It looks for an exact literal character match.
        
//        String fullNam = "Jennilyn M. Labicane";
//        
//        // 1. Standard check (starts at index 0)
//        boolean check1 = fullNam.startsWith("Jennilyn");  // true
//        boolean check2 = fullNam.startsWith("jennilyn");  // false (case sensitivity)
//        boolean check3 = fullNam.startsWith("M");  // false
//        // Print the result
//        System.out.println("Starts with 'Jennilyn': " + check1);
//        System.out.println("Starts with 'jennilyn': " + check2);
//        System.out.println("Starts with 'M': " + check3);
//        
//        // 2. Using an offset index
//        // The word "Java" starts at index 11
//        boolean checkOffset1 = fullNam.startsWith("Labicane", 12);  // true
//        boolean checkOffset2 = fullNam.startsWith("M", 9); // true
//
//        System.out.println("Starts with 'Labicane' at index 12: " + checkOffset1);
//        System.out.println("Starts with 'M' at index 9: " + checkOffset2);
     
// 4. indexOf()
//    A short description of what the method does.
//The indexOf() method in Java returns the 0-indexed position of the first occurrence
//of a specified character or substring within a string.                    
//If the character or substring is not found, the method returns -1.
//Spaces are treated as characters and have their own index positions.


                        //  0123456789 so on and so forth
//             String fullN = "Jennilyn Labicane";
 
// The 4 Overloads of indexOf()                       
        // 1. Find a character
//        int index1 = fullN.indexOf('J'); 
//        System.out.println(index1); // Outputs:0 
//
//        // 2. Find a character starting from a specific index
//        int index2 = fullN.indexOf('y', 2); 
//        System.out.println(index2); // Outputs: 6 (skips letter before 2)
//
//        // 3. Find a substring
//        int index3 = fullN.indexOf("Lab"); 
//        System.out.println(index3); // Outputs: 9
//
//        // 4. Missing element returns -1
//        int index4 = fullN.indexOf("M"); 
//        System.out.println(index4); // Outputs: -1
        
// 5. indexOf() 
//    A short description of what the method does. 
// removes all leading and trailing whitespace characters from a string       
//        String original = "   Jennilyn Labicane   ";
//        String trimmed = original.trim();
//
//        System.out.println("Original:" + "'" + original + "'"); 
//        // Output:'  Jennilyn Labicane   '
//        
//        System.out.println("Trimmed:" + "'"+ trimmed + "'");  
//        // Output:'Jennilyn Labicane'

// 6. replace()
//    A short description of what the method does. 
//replaces every occurrence of a specific character or  
//substring in a string with a new character or substring
//returns a brand-new string with the updates applied
        
//        String nicknam = "Gelyn";
//        // 1. Replacing Characters /Replace 'G' character with 'J'
//        String result = nicknam.replace('G', 'J'); // Use single quotes (' ') to target literal character data.
//
//        System.out.println(result); 
//        // Output: Jelyn
//        
//        
//        // 2. Replacing Substrings
//        String text = " Hello! I'm Jennilyn Labicane ";
//        // Replace all occurrences of "Jennilyn" with "Gelyn"
//        String  outcome = text.replace("Jennilyn", "Gelyn");
//
//        System.out.println(outcome); 
//        // Output: I'm Gelyn Labicane
        
// 7. replace() / public char[] toCharArray()
//    A short description of what the method does.
// used to convert a string into a newly allocated character array (char[])

//          String text = "Jennilyn";
//        
//        // Convert String to char array
//        char[] charArray = text.toCharArray();
//        
//        // Iterate and print each character
//        for (char chr : charArray) {
//            System.out.println(chr);
//        }

// 8.nextLine().charAt()
//    A short description of what the method does.
// chaining scanner.nextLine().charAt(0) is used to read a single character
// from the user input by grabbing an entire line of text
// as a string and extracting the very first character

         Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a word or character: ");
        // Extracts the very first character of the entered line
        char letter = scanner.nextLine().charAt(0); 
        
        System.out.println("The first character is: " + letter);
        scanner.close();
        


        

       
    }
        
       
        
    }
    

