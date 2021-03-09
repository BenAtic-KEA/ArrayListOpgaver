package ArraylistOpgaver;

import java.util.ArrayList;

public class Exercise2 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();

        list.add("Hej");
        list.add("du");
        list.add("er");
        list.add("Cool");
        list.add("!");

        arrayToStringBackwards(list);

    }

    public static void arrayToStringBackwards(ArrayList<String> list){

        for(int i = list.size() - 1; i >= 0;i-- ){

            System.out.println(list.get(i));

        }
    }
}
