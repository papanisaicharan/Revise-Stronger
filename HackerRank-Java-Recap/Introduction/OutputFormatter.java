package Introduction;

import java.util.*;

public class OutputFormatter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            // https://www.baeldung.com/java-printstream-printf
            System.out.printf("%-14s %03d\n", s1, x);
            // https://www.java67.com/2014/10/how-to-pad-numbers-with-leading-zeroes-in-Java-example.html
        }
        System.out.println("================================");
        sc.close();
    }
}
