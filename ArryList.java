package allLists;

import java.util.*;

public class ArryList
{
    public static void main(String[] args)
    {
        ArrayList<Object> arrayList = new ArrayList();
        arrayList.add("Ahmad");
        arrayList.add("Khan Mohammad");
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(1.5);
        arrayList.add('d');

        // important function in array list
        arrayList.remove(0); // to remove the first element in array list

        System.out.println("Size of array List"+arrayList.size()); // return the size of array list

        System.out.println("index number 0: "+arrayList.get(0)); // to return value by index number

        arrayList.set(3,4); // add data in specific index

        System.out.println("is array list empty: "+arrayList.isEmpty()); // check the array list is this empty or not

        arrayList.set(2,"Hamdullah"); // update the element in specific position

        // showing object using Iterator
        Iterator<Object> iterator = arrayList.iterator();
        while(iterator.hasNext())
        {
            Object object = iterator.next();
            System.out.println(object);
        }

    }
}
