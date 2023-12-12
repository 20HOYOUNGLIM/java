package ct7;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

class Student{
    private String name, major, id, grade;
    public Student() {}
    public Student(String name, String major, String id, String grade) {this.name = name; this.major = major; this.id = id; this.grade = grade;}
    public String getName() {return name;}
    public String getMajor() {return major;}
    public String getId() {return id;}
    public String getGrade() {return grade;}
    public void find_student(String name) {
        if(name.equals(this.name)) {
            System.out.println(this.name+", "+this.major+", "+this.grade+", "+this.grade);
        }
    }
}

public class No5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("학생 이름, 학과, 학점 평균을 입력하세요.");
        ArrayList<Student> arr = new ArrayList<>();
        for(int i = 0; i < 4; i++){
            System.out.print(">> ");
            String s = sc.nextLine();
            StringTokenizer st = new StringTokenizer(s, ",");
            String name = st.nextToken();
            String major = st.nextToken();
            String id = st.nextToken();
            String grade = st.nextToken();
            arr.add(new Student(name, major, id, grade));
        }
        System.out.println("----------------------");
        for(int i = 0; i < 4; i++){
            System.out.println("이름: " + arr.get(i).getName());
            System.out.println("학과: " + arr.get(i).getMajor());
            System.out.println("학번: " + arr.get(i).getId());
            System.out.println("학점평균: " + arr.get(i).getGrade());
            System.out.println("----------------------");
        }
        while (true){
            System.out.println("학생 이름 >>");
            String name = sc.nextLine();
            if(name.equals("그만")) break;
            for(int i = 0; i < arr.size(); i++){
                Student s = arr.get(i);
                s.find_student(name);
            }
        }
    }
}