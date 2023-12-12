package ct7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


public class No8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("** 포인트 관리 프로그램입니다. **");
        HashMap<String, Integer> hm = new HashMap<>();
        while (true) {
            System.out.print("이름과 포인트 입력 >> ");
            String name = sc.next();
            if (name.equals("그만")) break;
            int score = sc.nextInt();
            if (hm.get(name) == null) {
                hm.put(name, score);
            } else {
                hm.put(name, score + hm.get(name));
            }
            Set<String> key = hm.keySet();
            Iterator <String> it = key.iterator();
            while (it.hasNext()){
                String str = it.next();
                    System.out.print("(" + str + "," + hm.get(str) + ")");
            }
            System.out.println();
        }
    }
}
