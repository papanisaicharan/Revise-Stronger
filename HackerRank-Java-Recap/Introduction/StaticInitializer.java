package Introduction;

// Static initialization blocks are executed when the class is loaded, 
// and you can initialize static variables in those blocks.

import java.util.Scanner;

// https://docs.oracle.com/javase/tutorial/java/javaOO/initial.html
// https://stackoverflow.com/questions/9379426/java-when-is-a-static-initialization-block-useful

public class StaticInitializer {
    static Scanner scan = new Scanner(System.in);
    static int B = scan.nextInt();
    static int H = scan.nextInt();
    static boolean flag = ( B>0 && H>0);
    static {
        try{
            if(!flag){
                throw new Exception("Breadth and height must be positive");
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }
            
    }//end of main

}//end of class
