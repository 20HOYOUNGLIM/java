import java.util.Scanner;
public class Number3{

    public static void main(String[] args){
        System.out.print("정수를 입력하세요>> ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = n; i > 0; i--){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}