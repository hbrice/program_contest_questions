package practice_questions;
import java.io.*;
import java.util.*;

public class questions_2011 {
	private static Scanner scanner;

	public static void main(String[] args) {
		try{
			 File file = new File ("input4.txt");
			 scanner = new Scanner (file);
		 } catch (FileNotFoundException e) {
			 System.out.println(e);
		 }
		// number of scans
		String first = scanner.nextLine();
		int num = Integer.parseInt(first);
		
		String line = "";
		for(int i = 0; i < num; i++){ //each line of input
			line = scanner.nextLine();
			char[] list = line.toCharArray();
			String original = line; // boxwood
			String reverse = "";
			
			//System.out.println(list);
			int len = list.length; //7
			//System.out.println(len);
			for(int j = len-1; j >= 0 ; j--){
				if(list[j] == 'b'){
					reverse += 'd';
				}else if(list[j] == 'd'){
					reverse += 'b';
				}else if(list[j] == 'p'){
					reverse += 'q';
				}else if(list[j] == 'q'){
					reverse += 'p';
				}else if((list[j] == 'A') || (list[j] == 'H') || (list[j] == 'I') || (list[j] == 'M') || (list[j] == 'O') || (list[j] == 'T') ||  (list[j] == 'U') || (list[j] == 'V') || (list[j] == 'W') || (list[j] == 'X') || (list[j] == 'Y') || (list[j] == '8') || (list[j] == '0') ||(list[j] == 'i') || (list[j] == 'l') || (list[j] == 'o') || (list[j] == 'v') || (list[j] == 'w') || (list[j] == 'x')){
					reverse += list[j];
				}else{
					System.out.println("Does not reflect well");
					return;
				}				 
			}
			if(original.equals(reverse)){
				System.out.println("Identical reflection");
				
			}else{
				System.out.println(reverse);
			}

		}// end of for loop
	}
}
