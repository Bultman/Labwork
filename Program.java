import java.util.Scanner;

public class Program {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner height = new Scanner(System.in);
System.out.print("Enter your height:");
float myHeight= height.nextFloat();
Scanner weight= new Scanner(System.in);
System.out.print("Enter your weight:");
float myWeight= weight.nextFloat();
float height2=myHeight * myHeight; 
float bMI= myWeight/height2;
System.out.println("Your BMI is: "+bMI);


	}

}
