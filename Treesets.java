package allSets;

import java.util.TreeSet;

public class Treesets
{
    public static void main(String[] args)
    {


        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(5);
        treeSet.add(3);
        treeSet.add(4);
        treeSet.add(2);
        treeSet.add(7);

        // this have the same function like hashsets
        System.out.println("Size: "+treeSet.size()); // return the size of treeSet
        treeSet.remove(2);                        // remove the specific element from treeSet
        System.out.println(treeSet.ceiling(6));  // return the number of perfect index

        System.out.println("==========");
        for( Integer obj : treeSet)
        {
            System.out.println(obj);
        }

    }
}
