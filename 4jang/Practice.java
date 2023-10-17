package jang4;
import java.util.Scanner;

class TV{
	private String company; // 제품 회사
	private int year; // 만들어진 년도
	private int size; // 인치
	
	public TV(String company, int year, int size) {
		this.company = company;
		this.year = year;
		this.size = size;
	}
	
	public void show(){
		System.out.println(company+"에서 만든 "+year+"년형 "+size+"인치 TV");
	}
}

public class Practice {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		TV myTV = new TV("LG", 2017, 32); // LG에서 만든 2017년 32인치
		myTV.show();
	}
}