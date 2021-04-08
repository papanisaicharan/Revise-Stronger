package Introduction;

import java.util.Scanner;

// In computing, End Of File (commonly abbreviated EOF) is a condition in a computer
//  operating system where no more data can be read from a data source.
public class EndOfFile {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int count = 0;
        while(scan.hasNext()){
            count+=1;
            System.out.printf("%d %s\n", count, scan.nextLine());
        }
        scan.close();
    }
}
