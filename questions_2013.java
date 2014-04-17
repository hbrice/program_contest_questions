package practice_questions;

import java.io.*;
import java.util.*;

public class questions_2013 {
	private static Scanner scanner;

	public static void main(String[] args) {

		try{
			 File file = new File ("input3.txt");
			 scanner = new Scanner (file);
		 } catch (FileNotFoundException e) {
			 System.out.println(e);
		 }
		 
		 String first = scanner.nextLine();
		 int num = Integer.parseInt(first);
		
		 int game = 0;
		 String line = "";
		 for(int i = 0; i < num; i++){
			 line = scanner.nextLine();
			 int score = 0;
			 int pushups = 0;
			 String[] list = line.split(" ");
			 
			 for(int j = 0; j < list.length; j++){	//prints every element in array
				 if(list[j].equals("TD+2")){
					 score += 8;
					 pushups += score;
				 } else if(list[j].equals("TD+1")){
					 score += 7;
					 pushups += score;
				 } else if(list[j].equals("TD")){
					 score += 6;
					 pushups += score;
				 } else if(list[j].equals("S")){
					 score += 2;
					 pushups += score;
				 } else if(list[j].equals("FG")){
					 score += 3;
					 pushups += score;
				 } else{
					 score += 0;
				 }
			 }
			 game++;
			 System.out.println("Game " + game + ": final score " + score + ", total push-ups " + pushups);
		 }
		 		
	}

}
