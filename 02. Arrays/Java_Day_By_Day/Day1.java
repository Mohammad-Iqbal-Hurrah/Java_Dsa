import java.util.*;

class Arrays {

    //Array input 
    public static void inputElements(int arr[], int size) {
        System.out.println("Input Array Elements :");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();  //take input at index i
        }
    }

    //display array elements 
    public static void displayArray(int arr[]) {
        System.out.println("\nArrays Elements are:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    //linear Search method 
    public static int linearSearch(int arr[], int key) {
        System.out.println("Searching Element in the array:\n");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    //Largest in Array
    public static int largestElement(int arr[]){
        System.out.println("\nSearching for largest in array:");
        int largest = Integer.MIN_VALUE;
        for(int i =0; i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        return largest;
    }

    //binary search
    public static int binarySearch(int arr[], int key){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = (start+end)/2;
            if(arr[mid] == key){
                return mid;
            }
            else if(arr[mid] > key){
                end = mid-1;
            }else{
                start = mid+1;
            }

        }

        return -1;
    }

    //Reverse an array
    public static void reverseArray(int arr[]){
        System.out.println("\nReversing array");
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            //swap values 
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    //pairs in array 
    public static void pairs(int arr[]){
        System.out.println("\nPairs in array are: ");
        int totalPairs = 0;
        for(int i = 0; i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                System.out.print("(" + arr[i] + "," + arr[j] + ")");
                totalPairs++;
            }
        }
        System.out.println("\nTotal pairs are: "+totalPairs);
    }

    //subarrays
    public static void subArrays(int arr[]){
        System.out.println("SubArrays:\n");
        int totalSubArrys = 0;
        for(int i = 0; i<arr.length;i++){
            for(int j = i;j<arr.length;j++){
                for(int k = i; k <= j; k++) {
                System.out.print(arr[k]);
            }
            totalSubArrys++;
            System.out.print(", ");
            }
            System.out.println();
        }
        System.out.println("Total SubArrays: "+ totalSubArrys);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        // input elements 
        inputElements(arr, n); //take array input 

        //display array elements 
        displayArray(arr);  //print array elements 

        //linear Search
        int index = linearSearch((arr),34 );
        if(index != -1){
            System.out.print("Element found at index "+ index);
        }else{
            System.out.println("Element not found in the array.");
        }

        //largest in the array 
        System.out.println("Largest Element in the array is: "+largestElement(arr));

        int arr2[] = {10,20,30,40,50,60}; // array for binary search 

        //binary search 
        int binIndex = binarySearch((arr2),60);
        if(binIndex != -1){
            System.out.println("Element Found at index: "+binIndex);
        }else{
            System.out.println("Element Not Found in the array.");
        }

        displayArray((arr)); // array before reverse
        reverseArray(arr); 
        displayArray((arr)); //reversing array

        //pairs in array 
        pairs(arr);

        //SubArrays 
        subArrays(arr);

    } //main method end 
} //class end 
