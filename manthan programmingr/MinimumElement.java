public class MinimumElement{
        public static void main(String[] args) {
            int[] arr = { 4, 2, 9, 7, 5, 1,  8 };
            int min = findMinimum(arr);
            System.out.println("Minimum element in the array: " + min);
        }
    
        public static int findMinimum(int[] arr) {
            // Check if the array is empty
            if (arr.length == 0) {
                System.out.println("Array is empty");
            }
    
            // Initialize min with the first element of the array
            int min = arr[0];
    
            // Iterate through the array to find the minimum element
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
    
            return min;
        }
    }
    
    

