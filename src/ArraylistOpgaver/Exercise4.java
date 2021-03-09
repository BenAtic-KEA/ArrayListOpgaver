package ArraylistOpgaver;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise4 {


    public static void main(String[] args) {



        userStringToArray();


    }

    public static void userStringToArray() {
        ArrayList<String> list = new ArrayList<String>();

        boolean addToArray = true;
        String userString;


        while (addToArray) {

            System.out.print("Add a String to the array: ");
            userString = getStringInput();

            if(!userString.equals("no strings attached")) {

                list.add(userString);

                System.out.println("to exit write " + "\"no strings attached\"");
            } else {

                addToArray = false;
            }

            System.out.println(list);


        }

    }

    public static String getStringInput(){
        Scanner userInput = new Scanner(System.in);

        return userInput.nextLine();

    }

}


