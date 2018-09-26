package utils;

public class AskForInput {

  public void askForString(){

    System.out.println("Please, enter your name");

    ReadData readData = new ReadData();

    String nameInserted = readData.readString();

    System.out.println("Your name is: " + nameInserted);
  }
  
  public void askForInt() {
	  System.out.println("Please, enter your age");
	  
	  ReadData readData = new ReadData();
	  
	  int numberInserted = readData.readInt();
	  
	  System.out.println("Your age is: " + numberInserted);
  }
}
