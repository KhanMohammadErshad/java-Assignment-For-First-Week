package allMap;

import allLists.Student;

import java.util.HashMap;

public class Hashemap
{
    public static void main(String[] args) {
            HashMap<String, String> hashMap = new HashMap<>();

        // Adding values to HashMap as ("keys", "values")
        hashMap.put("Name", "Hamdullah");
        hashMap.put("Father Name", "Mohammad Omer");
        hashMap.put("Last Name", "Hamdard");
        hashMap.put("Faculty", "Computer Science");

        System.out.println("Testing .isEmpty() method");

//        Checks whether the HashMap is empty or not if Not empty so printing the values


        hashMap.remove("Name"); // remove element by key
        // is this hash map is empty
        System.out.println("Empty: "+hashMap.isEmpty());
        System.out.println("______________________________");
        if (!hashMap.isEmpty())
        {
            System.out.println("HashMap is not empty");

            // Accessing the contents of HashMap through Keys
            System.out.println("Name : " + hashMap.get("Name"));
            System.out.println("Father Name : " + hashMap.get("Father Name"));
            System.out.println("Faculty : " + hashMap.get("Faculty"));
            System.out.println("Khan : " + hashMap.get("Khan"));

            // size() method prints the size of HashMap.
            System.out.println("Size Of HashMap : " + hashMap.size());
        }
        System.out.println(hashMap.entrySet());  // show the entire set of hashmap

        // is this Key 'Name' is in hashmap
        System.out.println(hashMap.containsKey("Name"));


    }
}
