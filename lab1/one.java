import java.io.*;
import java.util.*;
class myClass{
    public static void main(String[] args) {
      	// input
      	Scanner s = new Scanner(System.in);
        System.out.println("Input real and imaginary part of first complex no: (a + ib)");
        float a = s.nextFloat();
        float b = s.nextFloat();
        System.out.println("Input real and imaginary part of second complex no: (c + id)");
        float c = s.nextFloat();
        float d = s.nextFloat();
        
        System.out.println("Addition: (a+c)+(b+d)i");
        System.out.println((a+c)+" + (" + (b+d) +")i");
        System.out.println("Subtraction: (a-c)+(b-d)i");
        System.out.println((a-c)+" + (" + (b-d) +")i");
        System.out.println("Multiplication: (ac-bd)+(ad+bc)i");
        System.out.println((a*c-b*d)+" + (" + a*d+b*c +")i");
        System.out.println("Division: (ac+bd)/(c*c+d*d)+(bc-ad)/(c*c+d*d)i");
        float m = c*c+d*d;
        System.out.println((a*c+b*d)/m+" + (" + (b*c-a*d)/m +")"+"i");
    }
}
