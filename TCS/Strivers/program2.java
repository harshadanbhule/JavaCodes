//Find the largest number in an array
import java.util.*;
class Demo{
        public static void main(String [] args){
                int arr[]=new int[]{2,45,1,9,3};

                Arrays.sort(arr);


                System.out.println(arr[arr.length-1]);
        }
}
