package day14.discussion;

public class MathClass {

    public static void main(String[] args) {
//      . Research Phase
//Each student will research the following Java String methods:

//1. Math.abs() → absolute value    
//returns the absolute value of a number.
// the output is always positive or zero, negative numbers become positive, 
//while positive numbers remain unchanged.
// is overloaded to accept four different numeric primitive types.
        // Integer example
        int negativeInt = -26;
        int resultInt = Math.abs(negativeInt);
        System.out.println("Absolute int: " + resultInt); // Outputs: 25

        // Double example
        double negativeDouble = -17.11;
        double resultDouble = Math.abs(negativeDouble);
        System.out.println("Absolute double: " + resultDouble); // Outputs: 17.11

        // Distance between two variables
        int positionA = 11;
        int positionB = 17;
        int distance = Math.abs(positionA - positionB);
        System.out.println("Distance: " + distance); // Outputs: 6

//2. Math.max() → maximum of two values
        //class that compares two numeric arguments and returns the larger of the two.
        //example 1
        int x = 11;
        int y = 17;

        int highest = Math.max(x, y);
        System.out.println("The maximum is: " + highest); // Outputs: 17

        // example 2
        int[] scores = {1, 10, 20, 9, 2};
        int maxScore = scores[0]; // Start with the first element

        for (int score : scores) {
            maxScore = Math.max(maxScore, score);
        }

        System.out.println("Top Score: " + maxScore); // Outputs: 20

//3. Math.min() → minimum of two values
// class that compares two numeric arguments and returns the smaller of the two.
        // example 1
        int num = 17;
        int num2 = 11;

        int lowest = Math.min(num, num2);
        System.out.println("The maximum is: " + lowest); // Outputs: 11

        // example 2
        double[] temperatures = {37, 38.8, 39.8, 35.5};
        double minTemp = temperatures[0]; // Start with the first element

        for (double temp : temperatures) {
            minTemp = Math.min(minTemp, temp);
        }

        System.out.println("Lowest Temperature: " + minTemp); // Outputs: 35.5

//4. Math.pow() → power (exponentiation)
//class used to raise a base number to the power of an exponent (exponentiation).
//it takes and returns double types, any integers passed into it are automatically cast to double
        // Calculates 2 raised to the power of 3 (2^3)
        double result = Math.pow(2, 3);
        System.out.println("2^3 = " + result); // Outputs: 8.0

        // Manual casting if you explicitly need an integer output
        int intResult = (int) Math.pow(5, 3); // (5^3)
        System.out.println("5^2 as int = " + intResult); // Outputs: 125

//5. Math.sqrt() → square root       
//class used to calculate the positive square root of a given number.  
        // Calculate the square root of 25 (√25)
        double resul = Math.sqrt(25);
        System.out.println("Square root of 25: " + resul); // Outputs: 5.0

        // Manual casting for integer results
        int intResul = (int) Math.sqrt(144);
        System.out.println("Square root of 144 as int: " + intResul); // Outputs: 12

        //Edge Cases: Negative Numbers and NaN
        //Because you cannot calculate the real square root of a negative number,
        //passing a negative value returns NaN (Not a Number) instead of throwing an exception.
        double negativeInput = -9.0;
        double resu = Math.sqrt(negativeInput);

        System.out.println("Result: " + resu); // Outputs: NaN

//6. Math.round() → round to nearest integer
//always outputs a whole integer type
        double value1 = 7.3;
        double value2 = 7.7;

        // 1. Math.round() -> Returns long/int (Nearest)
        System.out.println(Math.round(value1)); // Outputs: 7
        System.out.println(Math.round(value2)); // Outputs: 8

        // 3. Math.ceil() -> Returns double (Forces Up)
        System.out.println(Math.ceil(value1));  // Outputs: 8.0
        System.out.println(Math.ceil(value2));  // Outputs: 8.0

        // 2. Math.floor() -> Returns double (Forces Down)
        System.out.println(Math.floor(value1)); // Outputs: 7.0
        System.out.println(Math.floor(value2)); // Outputs: 7.0

//7. Math.ceil() → round up (ceiling)
//class that rounds a floating-point number up to the nearest mathematical integer.
//"Ceiling" means it pushes the value toward positive infinity.
        //example 1
        System.out.println(Math.ceil(7.2));   // Outputs: 8.0
        System.out.println(Math.ceil(7.7));   // Outputs: 8.0
        System.out.println(Math.ceil(7.0));   // Outputs: 7.0 (No decimal fraction)
        System.out.println(Math.ceil(-7.9));  // outputs: -7 /Moves right on the number line toward positive infinity /(closer to zero)
        
        //example 2
        // Manual casting to save the result as an integer
        int celingWholeNumber = (int) Math.ceil(12.02);
        System.out.println(celingWholeNumber);  // Outputs: 13

//8. Math.floor() → round down (floor)
// class that rounds a floating-point number down to the nearest mathematical integer.
//"Floor" means it pushes the value toward negative infinity.

        System.out.println(Math.floor(5.9));   // Outputs: 7.0
        System.out.println(Math.floor(5.1));   // Outputs: 7.0
        System.out.println(Math.floor(5.0));   // Outputs: 7.0
        System.out.println(Math.floor(-5.9)); // Outputs: -6.0 /Moves left on the number line toward negative infinity /(further from zero)

        // Manual casting to save the result as an integer
        int lowerWholeNumber = (int) Math.floor(12.85);
        System.out.println(lowerWholeNumber);  // Outputs: 12


//9. Math.random() → random number between 0.0 and 1.0
//  class used to generate a pseudo-random floating-point number.
//The number returned is always within a specific mathematical range: [0.0, 1.0)
//It is inclusive of 0.0 (it can return exactly 0.0).
//It is exclusive of 1.0 (it will get incredibly close, like 0.999999..., but it will never return exactly 1.0).
        
        //example 1
        // Generate a random double between 0.0 and 0.9999...
        double randomValue = Math.random();
        System.out.println("Random double: " + randomValue); 
        // Example output: Random double: 0.7594303434 // it gives random numbers

       // Simulated 6-sided die outcome tracker (shifting for 1-6 range below)
// If limit is 6, outputs can be: 0, 1, 2, 3, 4, or 5
int zeroToFive = (int) (Math.random() * 6); 
        System.out.println(zeroToFive);

//10. Math.log() → natural logarithm (base e)
//Math.log10() → logarithm base 10
//Math.exp() → exponential function (e^x)
//Math.sin() → sine of an angle (in radians)
//Math.cos() → cosine of an angle (in radians)
//Math.tan() → tangent of an angle (in radians)
    }

}
