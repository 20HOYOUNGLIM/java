import java.util.Scanner;
public class Number5{

    public static void main(String[] args){
        int n[] = new int [10];
        Scanner in = new Scanner(System.in);
        System.out.print("���� ���� 10���� �Է��ϼ��� >> ");
        for(int i = 0; i < 10; i++){
            n[i] = in.nextInt();
        }
        System.out.print("3�� ����� ");
        for(int i = 0; i < 10; i++){
            if(n[i] % 3 == 0){
                System.out.print(n[i] + " ");
            }
        }
    }
}