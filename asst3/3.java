import java.io.*;
import java.util.Scanner;

interface Function{
	public abstract int evaluate(int p);
}
class Half implements Function{
	public int evaluate(int p){
		return p/2;
	}
}

class client{
	public static int[] imp(int[] arr){
		Half update = new Half();
		for(int i=0; i<arr.length;i++)
		{
			arr[i] = update.evaluate(arr[i]);
		}
		return arr;
	}
	public static void main(String []args){
		int []arr = {24, 51, 62, 4, 10};
		System.out.println("Original Array:");
		for(int i = 0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
		arr = imp(arr);
		System.out.println("New Array:");
		for(int i = 0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
	} 
}
