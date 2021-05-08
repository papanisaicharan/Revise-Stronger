
### String

String A = "k";

Strings are immutable.

#### Methods
- A.length()
- A.substring(start, end)
- A.toLowerCase()
- A.toUpperCase()
- A.compareTo("test")
- A.charAt(index)

##### String comparsions
- By equals() method
- By == operator
- By compareTo() method -> "Sachin".compareTo("Ratan") -> 1 as "Sachin" > "Ratan"

##### Array of Strings
String[] substrings = new String[Size];

- Array sorting using Arrays class - contains majorly static methods - https://www.geeksforgeeks.org/array-class-in-java/

Arrays.sort(substrings);


### StringBuilder

Java StringBuilder class is used to create mutable (modifiable) string.

StringBuilder() creates an empty string Builder with the initial capacity of 16.
StringBuilder(String str) creates a string Builder with the specified string.
The StringBuilder Class has many important methods. Some of them are:

public StringBuilder append(String s) is used to append the specified string with this string. The append() method is overloaded like append(char), append(boolean), append(int), append(float), append(double) etc.
public StringBuilder reverse() is used to reverse the string.

https://docs.oracle.com/javase/7/docs/api/java/lang/StringBuilder.html

StringBuilder R = new StringBuilder(A);
Methods:
R.reverse()

