package thirdweek;

import java.math.BigDecimal;
import java.math.BigInteger;

import static java.lang.Long.MAX_VALUE;

public class OOP
{
    public static void main(String args[])
    {
        System.out.println(MAX_VALUE);
        BigInteger intNumber = BigInteger.valueOf(123434344); //BigInteger can represent an integer of any size.
        BigDecimal realNumber = BigDecimal.valueOf(23452345.23452345);// BigDecimal can represent a real number of any size.

        Object nameOfAuthor = "khan Mohammad";

        abstraction obj = new abstraction();
        obj.add(1,"khan");
        System.out.println("Name of Author: "+nameOfAuthor);
        System.out.println("SID: "+obj.getId()+" STnAME: "+obj.getName()+" SubName: "+obj.getSubName()+" faculty Name"+obj.getFacultyName());

    }
}
