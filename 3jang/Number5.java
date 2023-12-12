import java.util.Scanner;
public class Number5{

    public static void main(String[] args){
        int n[] = new int [10];
        Scanner in = new Scanner(System.in);
        System.out.print("양의 정수 10개를 입력하세요 >> ");
        for(int i = 0; i < 10; i++){
            n[i] = in.nextInt();
        }
        System.out.print("3의 배수는 ");
        for(int i = 0; i < 10; i++){
            if(n[i] % 3 == 0){
                System.out.print(n[i] + " ");
            }
        }
    }
}