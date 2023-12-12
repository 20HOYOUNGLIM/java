package ct6;

import java.util.Random;
import java.util.Scanner;

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}


class GambleGame {
    private Person[] player = new Person[2];
    public Scanner sc;
    public int index;
    public String buffer;

    public GambleGame() {
        sc = new Scanner(System.in);
        index = 0;
    }

    public void run() {
        System.out.print("1번째 선수 이름 >>");
        player[0] = new Person(sc.nextLine());
        System.out.print("2번째 선수 이름 >>");
        player[1] = new Person(sc.nextLine());


        while(true) {
            System.out.print("[" + player[index].getName() + "]:<Enter>");
            sc.nextLine();
            int a = (int)(Math.random()*3+1);
            int b = (int)(Math.random()*3+1);
            int c = (int)(Math.random()*3+1);
            System.out.print("\t" + a + "\t" + b + "\t" + c + "\t");
            if(a == b && b == c){
                System.out.println(player[index].getName() + "님이 이겼습니다!");
                break;
            }
            else{
                System.out.println("아쉽군요!");
                index = index == 1 ? 0 : 1;
            }
        }
    }
}

public class No10 {
    public static void main(String[] args) {
        GambleGame game = new GambleGame();
        game.run();
    }
}
