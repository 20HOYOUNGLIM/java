package ct7;

import java.util.Scanner;
import java.util.Vector;

public class No1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> ve = new Vector<Integer>();
        System.out.print("정수(-1이 입력 될 때 까지)>> ");
        int max = 0;
        while(true){
            int n = sc.nextInt();
            if(n == -1) break;
            ve.add(n);
            if(max < n){
                max = n;
            }
        }
        System.out.print("가장 큰 수는 " + max);
    }
}