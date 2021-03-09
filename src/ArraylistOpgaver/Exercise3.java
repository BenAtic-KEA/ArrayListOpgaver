package ArraylistOpgaver;

import java.util.ArrayList;

public class Exercise3 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();

        list.add("Hej");
        list.add("du");
        list.add("er");
        list.add("Cool");
        list.add("!");

        partOfArray(2,4,list);

    }

    public static void partOfArray(int n, int k, ArrayList<String> list){

        for(n = n; n < k; n++){

            System.out.println(list.get(n));

        }

    }


}
