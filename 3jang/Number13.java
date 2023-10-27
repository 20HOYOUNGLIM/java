import java.util.Scanner;
public class Number13{

    public static void main(String[] args){
        for(int i = 1; i< 100; i++){
            int t1 = i % 10;
            int t2 = i / 10;
            if((t1 == 3 || t1 == 6 || t1 == 9) && (t2 == 3 || t2 == 6 || t2 == 9)){
                System.out.println(i + " ¹Ú¼ö Â¦Â¦");
            }
            else if(t1 == 3 || t1 == 6 || t1 == 9 || t2 == 3 || t2 == 6 || t2 == 9){
                System.out.println((i + " ¹Ú¼ö Â¦"));
            }
        }
    }
}