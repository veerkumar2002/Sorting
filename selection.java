import java.util.*;
public class selection {
    public static void selectionSortDecending(int arr[]){
        for(int turn=0; turn<arr.length;turn++){
            int minPos = turn;
            for(int j=turn+1;j<arr.length;j++){
                if(arr[minPos]<arr[j]){
                    minPos = j;

                }
            }
            //swap
            int temp = arr[turn];
            arr[turn] = arr[minPos];
            arr[minPos] = temp;
        }
        System.out.println();
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }

    
    }
public static void main(String args[]){
    int arr[]={3,6,2,1,8,7,4,5,3,1};
    selectionSortDecending(arr);
    printArr(arr);
}
}
