package utils;

public class AskForInput {

  public void askForString(){

    System.out.println("Please, enter your name");

    ReadData readData = new ReadData();

    String stringInserted = readData.readString();

    readData.setInputString();

    System.out.println("Your name is: " + readData.getInputString());
  }

  public void askForInt() {
	  System.out.println("Please, enter your age");

	  ReadData readData = new ReadData();

	  int intInserted = readData.readInt();

    readData.setIntInserted()

	  System.out.println("Your age is: " + myAccount.getIntInserted);
  }
}
