package ct7;

import java.util.Scanner;
import java.util.ArrayList;

public class No2 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>>");
        int sum = 0;
        for(int i = 0; i < 6; i++){
            String b = sc.next();
            arr.add(b);
            char a = b.charAt(0);
            if(a == 'A'){
                sum += 4;
            }
            else if(a == 'B'){
                sum += 3;
            }
            else if (a == 'C') {
                sum += 2;
            }
            else if(a=='D'){
                sum += 1;
            }
        }
        System.out.print((double)sum / (double)arr.size());
    }
}