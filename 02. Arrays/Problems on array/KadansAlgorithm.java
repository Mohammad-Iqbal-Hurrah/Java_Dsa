
public class KadansAlgorithm {

    public static int kadansAlgo(int array[]) {
        //SPECIAL CASE: if all elements in the array are negative 
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
                if(array[i] > max){
                    max = array[i];
                }
            }
        if(max<0){
            return max;
        }
            int maxSUbArraySun = Integer.MIN_VALUE;
            int currSum = 0;
            for (int i = 0; i < array.length; i++) {
                currSum += array[i];
                if (currSum < 0) {
                    currSum = 0;
                }
                if (currSum > maxSUbArraySun) {
                    maxSUbArraySun = currSum;
                }
            }
            return maxSUbArraySun;
        }
    

    public static void main(String[] args) {
        // int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int arr[] = {-4,-3,-1,-2,4,7};
        System.out.print("Max Sub array sum = " + kadansAlgo(arr));

    }   //main method ends here
}   //class ends here 
