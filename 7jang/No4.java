package ct7;

import java.util.Scanner;
import java.util.Vector;

public class No4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> ve = new Vector<>();
        while(true){
            System.out.print("강수량 입력 (0 입력시 종료) >> ");
            int temp = sc.nextInt();
            if(temp == 0) break;
            ve.add(temp);
            int sum = 0;
            for(int i = 0; i < ve.size(); i++){
                System.out.print(ve.get(i) + " ");
                sum += ve.get(i);
            }
            System.out.println("\n현재 평균 " + sum / ve.size());
        }
    }
}