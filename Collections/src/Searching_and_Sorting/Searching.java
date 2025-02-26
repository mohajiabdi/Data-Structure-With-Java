package Searching_and_Sorting;

public class Searching <T> {
    public static void main(String[] args) {
        Integer[] arr = {10, 20, 30, 40, 50};
        int target = 100;
        boolean found = linearSearching(arr, 0, arr.length - 1, target);
        found = binarySearching(arr, target);
        System.out.println("Found: " + found);
    }







    // Linear search
    public static <T> boolean linearSearching(T[]data, int min, int max, T target) {
        int index = min;
        boolean found = false;
        while(!found && index<= max) {
            found = data[index].equals(target);
            index ++;
        }
        return found;
    }

    //Binary Search
    public static <T extends Comparable<T>> boolean binarySearching(T[] data, T target) {
        int min = 0;
        int max = data.length - 1;
        boolean found = false;
        while(min <= max && !found){
            int mid = (min + max)/2;

            if(data[mid].compareTo(target) == 0){
                found = true;
            }else if(data[mid].compareTo(target) >0){
                max = mid - 1;
            }else{
                min = mid + 1;
            }
        }
        return found;
    }


}
