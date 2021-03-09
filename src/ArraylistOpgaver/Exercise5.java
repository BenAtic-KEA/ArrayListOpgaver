package ArraylistOpgaver;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise5 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("Hej");
        list.add("du");
        list.add("er");
        list.add("Cool");
        list.add("!");

        System.out.println(list);
        swapIndex(2,4,list);

        System.out.println(list);

    }

    public static void swapIndex(int n, int k, ArrayList<String> list){

        Collections.swap(list,n,k);

    }




}
