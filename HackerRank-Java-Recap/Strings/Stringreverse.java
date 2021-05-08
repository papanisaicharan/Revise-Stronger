package Strings;

import java.util.Scanner;

public class Stringreverse {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int l = A.length();
        boolean valid = true;
        for(int i = 0; i < l/2; i++){
            if(A.charAt(i) != A.charAt(l-i-1)){
                valid = false;
                break;
            }
        }
        System.out.println(valid?"Yes":"No");
        // or we can solve it by StringBuilder reverse method
    }
}
