package ArraylistOpgaver;

import java.util.ArrayList;

public class Exercise6 {

    public static void main(String[] args) {
        charArray();


    }

    public static void charArray(){

        ArrayList<String> list = new ArrayList<String>();

        System.out.println("I will index your String in a Array");

        String userInput = Exercise4.getStringInput();

        for(int i = 0; i < userInput.length(); i++ ){

            list.add(userInput.substring(i,i+1));

            System.out.println(list);
        }

        System.out.println("Your final list is :" + list);
    }
}
