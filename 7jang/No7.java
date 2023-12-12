package ct7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


public class No7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("미래장학금관리시스템입니다.");
        HashMap<String, Double> hm = new HashMap<>();
        for(int i = 0; i < 5; i++){
            System.out.print("이름과 학점 >> ");
            String name = sc.next();
            double score = sc.nextDouble();
            hm.put(name, score);
        }
        System.out.print("장학금 선발 학점 기준 입력>> ");
        double fixScore = sc.nextDouble();
        Set<String> key = hm.keySet();
        Iterator <String> it = key.iterator();
        while (it.hasNext()){
            String name = it.next();
            if(fixScore < hm.get(name)){
                System.out.print(name + " ");
            }
        }
    }
}