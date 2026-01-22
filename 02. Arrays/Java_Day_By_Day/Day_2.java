class ClassCode {

    //max sub array sum 
    // 1. Brute force approach using 3 loops--> T.C Order of n cube 
    public static void maxSubArraySum(int array[]) {
        System.out.println("Max Sub Array Sum: ");
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        //starting index 
        for (int i = 0; i < array.length; i++) { 
            //ending index 
            for (int j = i; j < array.length; j++) { 
                currSum = 0; //update currSum for next new sub array

                //subArray sum calculation
                for (int k = i; k <= j; k++) {
                    currSum += array[k];
                }

                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }

        }
        System.out.println("Max SubArray sum = " + maxSum);
    }

    //max sub array sum 
    // 2. Using Prefix array
    // time complexity = order of n square 
    public static void maxSubArraySum2(int array[]) {
        System.out.println("Max Sub Array Sum: ");
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        int prefix[] = new int[array.length];
        prefix[0] = array[0];

        for (int i = 1; i < array.length; i++) {
            prefix[i] = prefix[i - 1] + array[i];
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                // currSum = 0; //update currSum for next new sub array
                // for(int k = i;k<=j;k++){
                //     currSum += array[k];
                // }

                // if start = 0 --> currSum = start ==0? prefix[end]: prefix[end] + prefix[start-1]
                currSum = i == 0 ? prefix[j] : (prefix[j] - prefix[i - 1]); 

                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }

        }
        System.out.println("Max SubArray sum = " + maxSum);
    }

    //MaxSubArray Sum using Kadan's algo
    //time complexity = order of n 
    public static void kadan(int array[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i =0; i<array.length;i++){
            currSum += array[i];
            if(currSum<0){
                currSum = 0;
            }
            if(currSum>maxSum){
                maxSum = currSum;
            }
        }
        System.out.println("Max SubArray sum = "+maxSum);
    }


    //trap water problem
    //time complexity = order of n --> linear time complexity 
    public static int trapWater(int height[]){
        int trapWater = 0;
        int n = height.length;

        //leftmax auxillary array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i =1;i<n;i++){
            leftMax[i] = Math.max(leftMax[i-1],height[i]);
        }

        //leftmax auxillary array
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i =n-2;i>=0;i--){
            rightMax[i] = Math.max(rightMax[i+1],height[i]);
        }

        //loop
        for(int i = 1; i<n;i++){
            //calculate water level
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            // trapwater = (water level - height)*width
            trapWater += (waterLevel-height[i]); //we assume width is 1 here 
        }
        return trapWater;
    }

    //Buy and Sell Stocks 
    public static int buyAndSellStocks(int stock[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i =0;i<stock.length;i++){
            if(buyPrice<stock[i]){ //stock[i] = current price or selling price 
                //calculate profit if buying price is smaller than selling price 

                int profit = stock[i] - buyPrice;  //today's profit 
                maxProfit = Math.max(maxProfit,profit);
            }
            else{
                buyPrice = stock[i]; //set buying price new smaller value 
            } 
            }
            return maxProfit;
        }
    public static void main(String[] args) {
        int arr[] = {4,2,1,0,3,2,5};
        // maxSubArraySum((arr));
        // maxSubArraySum2(arr);
        // kadan(arr);
        // System.out.print("TrapWater = "+trapWater(arr));
        System.out.print("mxProfit = " + buyAndSellStocks(arr));
    }
}
