import java.util.Scanner;

public class No9 {

	public static void main(String[] args) {
		System.out.println("원의 중심과 반지름 입력>>");
		Scanner s=new Scanner(System.in);
		double p1=s.nextDouble();
		double p2=s.nextDouble();
		double r=s.nextDouble();
		
		System.out.println("점 입력>>");
		double x=s.nextDouble();
		double y=s.nextDouble();
		
		double distance=Math.sqrt((x-p1)*(x-p1)+(y-p2)*(y-p2));
		if(distance<r)
		System.out.println("점"+x+","+y+"은"+"원 안에 있습니다.");
		else
		System.out.println("점"+x+","+y+"은"+"원 밖에 있습니다.");
		s.close();
	}
}