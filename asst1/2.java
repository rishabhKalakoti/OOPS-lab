import java.io.*;
import java.util.Scanner;

class Student{
	private int admno;
	private String name;
	private float marksEng;
	private float marksMath;
	private float marksSci;
	private float total;
	
	public void readData(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Input admno:");
		this.admno = Integer.parseInt(scan.nextLine());
		System.out.println("Input name:");
		this.name = scan.nextLine();
		System.out.println("Input marks in English:");
		this.marksEng = Float.parseFloat(scan.nextLine());
		System.out.println("Input marks in Maths:");
		this.marksMath = Float.parseFloat(scan.nextLine());
		System.out.println("Input marks in Science:");
		this.marksSci = Float.parseFloat(scan.nextLine());
	}
	
	public void showData(){
		System.out.println("-----------Student Data-----------");
		System.out.println("admno: " + this.admno);
		System.out.println("name: " + this.name);
		System.out.println("marksEng: " + this.marksEng);
		System.out.println("marksMath: " + this.marksMath);
		System.out.println("marksSci: " + this.marksSci);
		System.out.println("total: " + this.total);
	}
	
	public void compute(){
		this.total = this.marksEng + this.marksSci + this.marksMath;
	}
	
	public static void main(String[] args){
		Student s1 = new Student();
		s1.readData();
		s1.compute();
		s1.showData();		
	}
}
