package allSets;

import java.util.HashSet;
import java.util.Iterator;

public class Sets
{
    public static void main(String[] args) {
        HashSet<Object> hashSet = new HashSet<>();
        hashSet.add("khani");
        hashSet.add("jani");
        hashSet.add("ahmad");
        hashSet.add("khan");
        hashSet.add(1);
        hashSet.add(1.4);
        hashSet.add(true);
        hashSet.add('c');
        System.out.println(hashSet);

        System.out.println(hashSet.size());  // return the size of hash set
        System.out.println(hashSet.isEmpty());  // show that hash set is empty or not
        hashSet.clear();  // clear all element from hash set


        Iterator<Object> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            Object object = iterator.next();
            System.out.println(object);
        }

    }
}

