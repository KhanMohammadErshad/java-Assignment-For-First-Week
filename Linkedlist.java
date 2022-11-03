package allLists;

import java.util.LinkedList;

public class Linkedlist
{
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Ahmad");
        list.add("Khan");
        list.add("jan");
        list.add("out");
        list.add("khani");


                        // important function in linked list
        System.out.println(list.get(0)); // return the 0 index value from linked list

        list.add(1,"Khanoooooooo");// add a string to specific index

        list.removeFirst(); // remove the first data from linkedlist

        list.remove("jan"); // remove the element by it name

        // showing object using for loop
        for( String object : list)
        {
            System.out.println(object.length()+": "+object);
        }
        // this is the another method to show the items
        System.out.println(list);
    }
}
