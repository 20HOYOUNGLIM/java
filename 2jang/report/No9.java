import java.util.Scanner;

public class No9 {

	public static void main(String[] args) {
		System.out.println("���� �߽ɰ� ������ �Է�>>");
		Scanner s=new Scanner(System.in);
		double p1=s.nextDouble();
		double p2=s.nextDouble();
		double r=s.nextDouble();
		
		System.out.println("�� �Է�>>");
		double x=s.nextDouble();
		double y=s.nextDouble();
		
		double distance=Math.sqrt((x-p1)*(x-p1)+(y-p2)*(y-p2));
		if(distance<r)
		System.out.println("��"+x+","+y+"��"+"�� �ȿ� �ֽ��ϴ�.");
		else
		System.out.println("��"+x+","+y+"��"+"�� �ۿ� �ֽ��ϴ�.");
		s.close();
	}
}