//swap required

import java.util.*;

public class program2 {

    public static int answer(int size,int targetcolumn,int targetrow,int [][]arr){
        int currentrow=-1;
        int currentcolumn=-1;

        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
               if(arr[i][j]==1){
                currentrow=i;
                currentcolumn=j;
               }
            }
            if(currentrow!=-1){
                break;
            }
        }
        int swap=(currentrow-targetrow)+(currentcolumn-targetcolumn);
        
        return swap;
    }
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int targetrow=sc.nextInt();
    int targetcolumn=sc.nextInt();

    int [][] arr=new int[size][size];
     
    for(int i=0;i<size;i++){
        for(int j=0;j<size;j++){
            arr[i][j]=sc.nextInt();
        }

    }
    int result=answer(size ,targetcolumn,targetrow,arr);
    System.out.println(result);
   } 
}

