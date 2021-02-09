import java.util.ArrayList;
import java.util.Arrays;


public class MyMain {

    // Wrapper method
    public static boolean isSorted(ArrayList<Integer> list) {
        return isSortedRec(list, list.get(0));
    }

    // This recursive method checks if the array is sorted in 
    // non-decreasing order
    public static boolean isSortedRec(ArrayList<Integer> list, int i) {
        // YOUR CODE HERE
        if(list.size()==1){
            return true;
        }
        else{
            int i1 = list.get(0); 
            boolean a = i <= i1;
            ArrayList<Integer> list1 = list.subList(1, list.size());
            return a&&isSortedRec(list1, i1);
        }    
    }



     // Wrapper method
    public static boolean hasCountCopies(int[] arr, int x, int count) {

        return hasCountCopiesRec(arr, x, count, 0);
    }

    // This recursive method checks if the array contains exactly
    // count copies of the integer x
    public static boolean hasCountCopiesRec(int[] arr, int x, int count, int i) {//count is goal, i is existing
        if(arr.length==1){
            if(arr[0]==x&&(count-i)==1){
                return true;
            }
            else if(arr[0]!=x&&(count-1)==0){
                return true;
            }
            else{
                return false;
            } 
        }
        else{
            if(arr[0]==x){
                i++;
            }
            int[] arr1 = Arrays.copyOfRange(arr, 1, arr.length);
            return true&&hasCountCopiesRec(arr1, x, count, i);
        }
    }




    // Wrapper method
    public static boolean binarySearch(int[] arr, int num) {
        // YOUR CODE HERE
        return binarySearchRec(arr, num, 0, arr.length-1);
    }

    // This recursive method calls binary search on the array
    public static boolean binarySearchRec(int[] arr, int num, int lowerBound, int upperBound){        
        if(arr.length==1){
            if(arr[0]==num){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            int mid = (upperBound-lowerBound)/2;
            if(arr[mid]==num){
                return true;
            }
            else if(arr[mid] < num){
                lowerBound = mid;
                return binarySearchRec(arr, num, lowerBound, upperBound);
            }
            else{
                upperBound = mid - 1;
                return binarySearchRec(arr, num, lowerBound, upperBound);
            }
        }
    }

    public static void main(String[] args) {
        // You can test your code here
    }
}
