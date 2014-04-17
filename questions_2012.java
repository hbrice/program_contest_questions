package practice_questions; 
import java.io.*;
import java.util.*;

public class questions_2012 {
	private static Scanner scanner;

	public static void main(String[] args) {		
		 try{
			 File file = new File ("input.txt");
			 scanner = new Scanner (file);
		 } catch (FileNotFoundException e) {
			 System.out.println(e);
		 }
		 // number of scans
		 String first = scanner.nextLine();
		 int num = Integer.parseInt(first);
		 
		 String line = "";
		 for(int i = 0; i < num; i++){
			 line = scanner.nextLine();
			 String[] list = line.split(" ");
			 for(int j = 0; j < list.length; j++){
				 System.out.println(list[j]); //print out array
			 }
			 System.out.println("---");
			 
			 //multiply
			 int len = list.length;	//len = 2
			 int num1 = 0;
			 int num2 = 0;
			 int result = 0;
			 int result2 = 0;
			 int result3 = 0;
			 int firstDigit = 0;
			 int middleDigit = 0;
			 int lastDigit = 0;
			 int answer = 0;
			 if(len == 2){ //two numbers
				 num1 = Integer.parseInt(list[0]); // 32
				 num2 = Integer.parseInt(list[1]); // 32
				 if(num2 > 9 && num2 < 100){
					 lastDigit = num2 % 10; //last digit
					 result = lastDigit*num1;	// 6
					 System.out.println(result);	//192
					 firstDigit = Integer.parseInt(Integer.toString(num2).substring(0,1)); //1
					 result2 = firstDigit*num1; //32
					 System.out.println(result2);
					 System.out.println("---");
					 result2 = result2*10;
					 answer = result2 + result;
					 System.out.println(answer);
				 }else if(num2 > 99){
					 lastDigit = num2 % 10; //last digit:  2
					 result = lastDigit*num1;	// 
					 System.out.println(result);	//248
					 middleDigit = Integer.parseInt(Integer.toString(num2).substring(1,2)); //0
					 int temp = num2*10;
					 firstDigit = Integer.parseInt(Integer.toString(num2).substring(0,1)); //1
					 result3 = firstDigit*num1*10;
					 System.out.println(result3);
					 result3 = result3*10;
					 System.out.println("---");
					 answer = result3 + result;
					 System.out.println(answer);
				 } else{
					 result = num2*num1;
					 answer = result;
					 System.out.println(answer);

				 }
				 System.out.println("");
			 }
		 }	
	}
}
