package utils;

import java.util.Scanner;

//Instance variables
private String inputString;
private int inputInt;

//Sets the dataInputString and the dataInputInt
//in the object

public void setInputString(String inputString){
  this.inputString = inputString;
}

public void setInputInt(int inputInt){
  this.inputInt = inputInt;
}

//Retrieves the data from the object

public String getInputString(){
  return inputString;
}

public int getInputInt(){
  return inputInt;
}

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
