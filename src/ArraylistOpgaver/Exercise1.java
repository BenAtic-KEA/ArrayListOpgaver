package ArraylistOpgaver;

import java.util.ArrayList;

public class Exercise1 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();

        list.add("Hej");
        list.add("du");
        list.add("er");
        list.add("Cool");
        list.add("!");

        arrayToStringForward(list);

    }

    public static void arrayToStringForward(ArrayList<String> list){

        for(int i = 0; i<list.size(); i++){

            System.out.println(list.get(i));
        }
    }

}



