import java.util.Scanner;
public class WhileTest{

    public static void main(String[] args){
        int sum = 0,  i = 0;
        while (i < 100){
            sum += i;
            i += 2;
        }
        System.out.print(sum);
    }
}

