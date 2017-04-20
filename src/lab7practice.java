//https://www.dotnetperls.com/initialize-arraylist-java
//http://javadevnotes.com/java-initialize-array-examples

// Author: Saritha **** Lab - 7 ***  Date:04/17/17

import java.util.Scanner;

public class lab7practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int userInput;
        String doAgain;
        boolean isInputValue = false;

        System.out.println("Welcome to our Java class.");

        do {
            System.out.println("Which Student would you like to learn more about?(Enter a number 1-5):");
            userInput = scan.nextInt() - 1; //getting index from 1
            scan.nextLine(); // garbage line to reset the Scanner

            String[] studentName = {"Saritha", "Allie", "Lhea", "Peter", "Nick"};// creating array list
            String[] homeTown = {"Troy", "Rochester Hills", "Detroit", "Chicago", "Ohio"};
            String[] carName = {"Toyota", "Honda", "Nissan ", "BMW", "Ford",};

            if (userInput < 0) { //checking the conditions
                System.out.println("That student does not exit.Please try again.");
                System.out.println("Please try again.(Enter a number 1-5): ");
                doAgain = "Yes";
            }
            if (userInput > 5) {
                System.out.println("That student does not exit.Please try again.");
                System.out.println("Please try again.(Enter a number 1-5): ");
                doAgain = "yes";

            } else if ((userInput > 0) && (userInput <= 5)) { //asking the user
                System.out.println("Student" + (userInput + 1) + " is " + studentName[(userInput)] +
                        ". What would you like to know about" + studentName[(userInput)] + "? (Enter 'homeTown' or 'Car Name ')");

                do {
                    String whatInformation = scan.nextLine();//asking particular info

                    if (whatInformation.equalsIgnoreCase("HomeTown")) { //getting hometome
                        System.out.println(homeTown[(userInput)] + " is " + studentName[(userInput)] + "is HomeTown.");
                        isInputValue = true;

                    } else if (whatInformation.equalsIgnoreCase("Car Name")) { //car
                        System.out.println(carName[(userInput)] + " is " + studentName[(userInput)] + "Car.");
                        isInputValue = true;

                    } else {
                        System.out.println("That data does not exit. Please try again.(Enter 'Hometown' or 'Car Name')");
                        isInputValue = false;
                    }
                } while (!isInputValue);
            }
            System.out.println("Would you like to know more?(y/n)");//do again
            doAgain = scan.nextLine();


        } while (doAgain.equalsIgnoreCase("y"));
        System.out.println("Good bye!");
    }
}





