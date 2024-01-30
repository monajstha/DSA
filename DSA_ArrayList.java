import java.util.ArrayList;

public class DSA_ArrayList {
    public static void main(String[] args){
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add('A');
        dynamicArray.add('B');
        dynamicArray.add('C');

        dynamicArray.insert(0, "X");
        System.out.println(dynamicArray);
        System.out.println(dynamicArray.size);
        // time stamp: 57:00
    }
}