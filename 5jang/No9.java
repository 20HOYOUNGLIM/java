package ct5;

import java.util.Scanner;

interface Stack {
    int length(); // 현재 스택에 저장된 개수 리턴
    int capacity(); // 스택의 전체 저장 가능한 개수 리턴
    String pop(); // 스택의 톱(top)에 실수 저장
    boolean push(String val); // 스택의 톱(top)에 저장된 실수 리턴
}

class StackApp implements Stack{
    private int size;
    private int cnt;
    private String[] stack;
    public StackApp(int size){
        cnt = 0;
        this.size = size;
        stack = new String[size];
    }
    public int length(){
        return stack.length;
    }
    public int capacity(){
        return size - cnt;
    }
    public String pop(){
        return stack[--cnt];
    }
    public boolean push(String val){
        if(capacity() <= 0){
            return false;
        }
        else{
            stack[cnt] = val;
            cnt++;
            return true;
        }
    }
}

class No9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("총 스택 저장 공간의 크기 입력 >> ");
        int size = sc.nextInt();
        StackApp sa = new StackApp(size);
        while(true){
            System.out.print("문자열 입력 >>");
            String tmp = sc.next();
            if(tmp.equals("그만")) break;
            else{
                boolean s = sa.push(tmp);
                if(!s){
                    System.out.println("스택이 꽉 차서 푸시 불가!");
                }
            }
        }
        System.out.print("스택에 저장된 모든 문자열 팝:");
        int cntTmp = sa.capacity();
        for(int i = 0; i < sa.length() - cntTmp; i++){
            System.out.print(sa.pop() + " ");
        }
    }
}