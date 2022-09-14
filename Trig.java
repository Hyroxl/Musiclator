import java.lang.Math;
import java.util.Scanner;
import java.applet.*;
public class Trig
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = scan.nextInt();
		float numSin = (float) Math.sin(Math.toRadians(num));
		float numCos = (float) Math.cos(Math.toRadians(num));
		float numTan = (float) Math.tan(num);
		System.out.println(("sin(" + num + ") = " + numSin));
		System.out.println(("cos(" + num + ") = " + numCos));
		try {
		    System.out.println(("tan(" + num + ") = " + numTan));
		} catch(Exception e) {
		    System.out.println(("tan(" + num + ") = " + "Error"));
		}
	}
}
