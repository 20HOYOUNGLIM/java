package ct7;

import java.util.*;

interface IStack<T> {
    T pop();
    boolean push(T ob);
}

class MyStack<T> implements IStack<T>{
    private ArrayList<T> al;
    public MyStack() {al = new ArrayList<>();}
    public T pop(){
        if(al.size() != 0){
            return al.remove(0);
        }
        return null;
    }
    public boolean push(T ob){
        al.add(0, ob);
        return true;
    }
}

public class No9 {
    public static void main(String[] args) {
        IStack<Integer> stack = new MyStack<Integer>();
        for (int i=0; i<10; i++) stack.push(i);
        while(true) {
            Integer  n = stack.pop();
            if(n == null) break;
            System.out.print(n+" ");
        }
    }
}