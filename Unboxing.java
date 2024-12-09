// import ArrayList<> collection from java.util library to demonstrate 'Unboxing'
import java.util.ArrayList;

// 'Unboxing' example using ArrayList<> collection below
// convert from wrapper class -> primitive data type
public class Unboxing {
    // standard static main() method w/ void (no) return type
    public static void main(String[] args){
        // initialize wrapper class Character w/ value 'v'
        Character vegemite = 'v';
        // (1) 'unboxing' Character obj -> char primitive 
        char vv = vegemite;

        // https://stackoverflow.com/questions/12361492/how-to-determine-the-primitive-type-of-a-primitive-variable
        System.out.println(((Object)vv).getClass());    // this will show the wrapper class for respective primitive type ...

        // System.out.println(vv.getClass().getSimpleName()); // can NOT invoke .getClass() method on primitives (in Java) to check data type

        // create an ArrayList<Long> collection obj
        ArrayList<Long> arrayList = new ArrayList<Long>();

        // apply ArrayList<>'s .add() method to append Long to ArrayList
        // https://stackoverflow.com/questions/46562186/why-lst-add2-for-arraylistlong-gives-compile-error-instead-of-calling-addlo
        arrayList.add(777L);    // Note: need 'L' suffix for 'autoboxing' to Long wrapper class

        // (2) 'unboxing' String obj (.get() method accessing element (wrapper class obj) from index 0) -> long primitive
        long lucky = arrayList.get(0);
        // print out
        System.out.println(lucky);
    }
}