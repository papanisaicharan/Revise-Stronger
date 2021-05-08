package Strings;


// Can be solved using Arrays and Collections.sort method
public class StringsubstringComparision {
    public static void main(String[] args) {
        String s = "welcometojava";
        int k = 3;
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        smallest = s.substring(0,k);
        largest = s.substring(0,k);
        for(int i = 1; i <= s.length()-k; i++){
            String temp = s.substring(i,i+k);
            if(temp.compareTo(smallest) < 0){
                smallest = temp;
            }
            if(temp.compareTo(largest)>0){
                largest = temp;
            }
        }
        
        System.out.println(smallest + "\n" + largest);
    }
}
