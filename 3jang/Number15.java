import java.util.InputMismatchException;
import java.util.Scanner;
public class Number15{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (true){
            System.out.print("���ϰ��� �ϴ� �� �� �Է� >> ");
            try{
                int n = in.nextInt();
                int m = in.nextInt();
                System.out.print(n+"x"+m+"="+n*m);
                break;
            }
            catch (InputMismatchException e){
                System.out.println("�Ǽ��� �Է��ϸ� �ȵ˴ϴ�.");
                in.nextLine();
            }
        }

        in.close();
    }
}