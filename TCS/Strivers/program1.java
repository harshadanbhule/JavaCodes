//Find the smallest number in an array
import java.util.*;


class Demo{
        public static void main(String [] args){
                int arr[]=new int[]{2,45,1,9,3};
		int small=Integer.MAX_VALUE;
		int large=Integer.MIN_VALUE;
		int secsmall=Integer.MAX_VALUE;
                int seclarge=Integer.MIN_VALUE;
                for(int i=0;i<arr.length;i++){
			int num=arr[i];
			if(small>num){
				secsmall=small;
				small=arr[i];
			}
			if(large<num){
				seclarge=large;
				large=arr[i];
			}
		}

		System.out.println("Small : "+small +"Large : "+large);
        }
}

//using sort function
/*class Demo{
	public static void main(String [] args){
		int arr[]=new int[]{2,45,1,9,3};

		Arrays.sort(arr);

		System.out.println(arr[0]);
	}
}

//using arrayList


class Demo{
        public static void main(String [] args){
                ArrayList<Integer> arr=new ArrayList<>();
		arr.add(49);
		arr.add(4);
		arr.add(2);
		
                Collections.sort(arr);

                System.out.println(arr.get(0));
        }
}

*/
