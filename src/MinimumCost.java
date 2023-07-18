import java.util.Arrays;
import java.util.Scanner;

public class MinimumCost {
    static int mincost(int arr[],int size){
        Arrays.sort(arr);
        int cost=0;
        int j=0;
        for (int i=size-1;i>=0;i--){
            cost+=arr[i]*(j+1);
            j++;

        }
        return cost;

    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int size= scan.nextInt();
        int array[]=new int[size];
        for (int i=0;i<size;i++){
            array[i]= scan.nextInt();
        }
        System.out.println(mincost(array,size));

    }
}
