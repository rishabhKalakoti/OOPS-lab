import java.io.*;

class myClass{
  public static void main(String[] args) {
  	Console con = System.console();
    System.out.println("Input read and imaginary part of first complex no: (a + ib)");
    float a = Float.parseFloat(con.readLine());
    float b = Float.parseFloat(con.readLine());
    System.out.println("Input read and imaginary part of second complex no: (c + id)");
    float c = Float.parseFloat(con.readLine());
    float d = Float.parseFloat(con.readLine());
    System.out.println("Addition: (a+c)+(b+d)i");
    System.out.println((a+c)+" + (" + (b+d) +")i");
    System.out.println("Subtraction: (a-c)+(b-d)i");
    System.out.println((a-c)+" + (" + (b-d) +")i");
    System.out.println("Multiplication: (ac-bd)+(ad+bc)i");
    System.out.println((a*c-b*d)+" + (" + a*d+b*c +")i");
    System.out.println("Division: (ac+bd)/(c*c+d*d)+(bc-ad)/(c*c+d*d)i");
    float m = c*c+d*d;
    System.out.println((a*c+b*d)/m+" + (" + (b*c-a*d)/m +"i");
  }
}
