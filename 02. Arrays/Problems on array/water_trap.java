// Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
public class water_trap {

    //water trap method 
    public static int waterTrap(int height[]){
        int watertrap = 0;
        int n = height.length;
        //left maximum array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i = 1; i<n;i++){
            leftMax[i] = Math.max(leftMax[i-1],height[i]); 
        }

        //Right Auxillary maximum array 
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i = n-2; i>=0;i--){
            rightMax[i] = Math.max(rightMax[i+1],height[i]); 
        }
        //loop to calculate water level and water trap
        for(int i = 0; i<n;i++){
            //calculate water level 
            // water level = height of water - height of the bar 
            int waterLvel = Math.min(leftMax[i], rightMax[i]);
            //calculate watertrap-->watertrap = (waterLevel - height of bar )*width of the bar 
            //width of bar in this case = 6
            watertrap += (waterLvel-height[i])*6;
        }
        return watertrap;
    }
    public static void main(String[] args){
        int height[] = {4, 2, 0, 3, 2, 5};
        System.out.print("Water Trapepd = "+waterTrap(height));
    }
}
