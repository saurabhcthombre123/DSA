package problems;

import java.util.HashSet;
import java.util.Set;

public class ContainsCommonElement {

    public static void main(String[] args) {
        int[] array1 = {88, 2, 88, 55, 7};
        int[] array2 = {88, 8, 98, 25, 90, 76};

        System.out.println("common element present ? = "+ containsCommonElement(array1, array2));
    }

    static boolean containsCommonElement(int[] arr1, int[] arr2) {

        Set<Integer> distictSet = new HashSet<>();
        int length1 = arr1.length;
        int length2 = arr2.length;
        int index = 0;

        //solution using single while loop. doesn't work if the array has duplicates. O(n)
//        while(index < length1 && index < length2) {
//            if(distictSet.contains(arr1[index]))
//                return true;
//            else if(distictSet.contains(arr2[index]))
//                return true;
//            else{
//                distictSet.add(arr1[index]);
//                distictSet.add(arr2[index]);
//            }
//            index++;
//        }

        //using two for loops. O(n)
        for(int i = 0; i < length1; i++){
            distictSet.add(arr1[i]);
        }
        for(int i = 0 ; i< length2; i++){
            if(distictSet.contains(arr2[i]))
                return true;
        }
        return false;
    }
}
