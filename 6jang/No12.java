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
    private Person[] player;
    public Scanner sc;
    public int index, temp;
    public String buffer;

    public GambleGame() {
        sc = new Scanner(System.in);
        index = 0;
        temp = 0;
    }

    public void run() {

        System.out.print("겜블링 게임에 참여할 선수 숫자>>");
        index = sc.nextInt();
        player = new Person[index];
        buffer = sc.nextLine();
        for(int i = 0; i < index; i++){
            System.out.print(i+1 + "번째 선수 이름>>");
            player[i] = new Person(sc.nextLine());
        }

        while(true) {
            System.out.print("[" + player[temp].getName() + "]:<Enter>");
            sc.nextLine();
            int a = (int)(Math.random()*3+1);
            int b = (int)(Math.random()*3+1);
            int c = (int)(Math.random()*3+1);
            System.out.print("\t" + a + "\t" + b + "\t" + c + "\t");
            if(a == b && b == c){
                System.out.println(player[temp].getName() + "님이 이겼습니다!");
                break;
            }
            else{
                System.out.println("아쉽군요!");
                temp++;
                temp = index - 1 >= temp ? temp : 0;
            }
        }
    }
}

public class No12 {
    public static void main(String[] args) {
        GambleGame game = new GambleGame();
        game.run();
    }
}