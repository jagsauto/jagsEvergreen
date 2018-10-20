package Oops;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class javaLatest {




    public static void main(String args[]){


       /* int[] myArray1 = new int[]{1, 2, 3, 4};
        List<int[]> myArrayList = null;

        myArrayList.add(myArray1);

        myArrayList.forEach(item->System.out.println(item));
*/


        List<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(3);
        items.add(4);

      //  items.forEach(item->System.out.println(item));


        List<String> itemsString = new ArrayList<>();
        itemsString.add("A");
        itemsString.add("B");
        itemsString.add("C");
        itemsString.add("D");
        itemsString.add("E");


        itemsString.forEach(x->System.out.println(itemsString));
       itemsString.stream().filter(f->f.contains("C")).forEach(System.out::println);


    }


}
