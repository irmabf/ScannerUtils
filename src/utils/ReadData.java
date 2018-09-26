package utils;

import java.util.Scanner;

public class ReadData {
  public static  String  readString(){
    Scanner input = new Scanner(System.in);

    String myInput = input.nextLine();

    return myInput;
  }
  
  public static int readInt() {
	  Scanner input = new Scanner(System.in);
	  
	  int myInput = input.nextInt();
	  
	  return myInput;  
	  
  }
}
