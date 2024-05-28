import java.util.*;
class SingleDArray{

        public static void main(String[] args){
                Scanner sc =new Scanner(System.in);
                System.out.println("Enter Array Size : ");
                int size=sc.nextInt();
                int empId[]=new int[size];
                System.out.println("Array Size is "+ empId.length);

                System.out.println("Enter Array Element : ");
                for(int i=0;i<empId.length;i++){
                        empId[i]=sc.nextInt();
                }
                System.out.println("Array Element is : ");
                for(int i=0;i<empId.length;i++){
                        System.out.println(empId[i]);
                }
                int sum=0;
                 for(int i=0;i<empId.length;i++){
                        sum+=empId[i];

                }
                System.out.println("Sum of total elements is : "+sum);

        }
}
