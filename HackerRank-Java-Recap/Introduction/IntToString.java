package Introduction;

// We can convert int to string in Java using the following methods:

// Convert using Integer.toString(int)

// The Integer class has a static method that returns a String 
// object representing the specified int parameter.

// Convert using String.valueOf(int)

// The String class has several static methods that can convert 
// most primitive types to their String representation. This includes integers.

public class IntToString {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        int number = -782;
        String numberAsString = Integer.toString(number);
        System.out.println(numberAsString);
		String numberAsString1 = String.valueOf(number);
		System.out.println(numberAsString1);
    }
}
