public class BubbleSort {
    public static void main (String[] args){
        int[] arr={5,2,9,3,1};
        int n=arr.length;

        //perform bubble sort
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i; j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<n; i++)
        System.out.print(arr[i]+" ");
    }
    
    
}

//time complexity of bubble sort is O(n^2)
