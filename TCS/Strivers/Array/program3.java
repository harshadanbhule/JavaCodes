//Second Smallest and Second Largest element in an array

/*import java.util.*;
class Demo{
        public static void main(String [] args){
                int arr[]=new int[]{2,45,1,9,3};

                Arrays.sort(arr);

                System.out.println(arr[1]);
		System.out.println(arr[arr.length-2]);
        }
}*/


class Demo{
        public static void main(String [] args){
                int arr[]=new int[]{2,45,7,41,1,9,3};
                int small=Integer.MAX_VALUE;
                int large=Integer.MIN_VALUE;
                int secsmall=Integer.MAX_VALUE;
                int seclarge=Integer.MIN_VALUE;
                for(int i=0;i<arr.length;i++){
                        int num=arr[i];
                        if(small>num){
                                secsmall=small;
                                small=arr[i];
                        } else if (num < secsmall && num != small) {
                		secsmall = num;
            		}
                        if(large<num){
                                seclarge=large;
                                large=arr[i];
                        }else if (num > seclarge && num != large) {
                		seclarge = num;
            		}
                }

                System.out.println("Small : "+secsmall +"\nLarge : "+seclarge);
        }
}
