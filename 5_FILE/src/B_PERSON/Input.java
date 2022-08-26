package B_PERSON;

import java.util.Scanner;

public class Input {
	public static Scanner sc=new Scanner(System.in);
	public static int inputInt(String content){
		int result=0;
		System.out.println(content);
		result=sc.nextInt();
		return result;
	}
	public static String inputString(String content) {
		String result="";
		System.out.println(content);
		result=sc.nextLine();
		result=sc.nextLine();
		return result;
	}
	
	
}
