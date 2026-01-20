class Patterns {

    // print solid square
    public static void square(int side) {
        System.err.println("\nSolid Square\n");
        for (int i = 0; i < side; i++) {
            for (int j = 1; j <= side; j++) {
                System.err.print("* ");
            }
            System.err.println();
        }
    }

    // print hollow square
    public static void hollow(int side) {
        System.out.println("\nHollow Square Pattern\n");
        for (int i = 1; i < side + 1; i++) {
            for (int j = 1; j <= side; j++) {
                // top row || last row        //left col, right col
                if ((i == 1 || i == side) || (j == 1 || j == side)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // print solid rectangle
    public static void rectangle(int rows, int cols) {
        System.err.println("\nSolid Rectangle Pattren\n");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.err.print("* ");
            }
            System.err.println();
        }
    }

    // method overloading
    // hollow rectangle
    public static void hollow(int rows, int cols) {
        System.out.println("\nHollow Rectangle Pattern\n");
        for (int i = 1; i < rows + 1; i++) {
            for (int j = 1; j <= cols; j++) {
                // top row || last row //left col, right col
                if ((i == 1 || i == rows) || (j == 1 || j == cols)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void rotatedHalfPyramid(int rows) {
        System.out.println("\nRotated Half Pyramid\n");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //numbers half pyramid 
    public static void numbersHlafPyramid(int rows) {
        System.out.println("\nRotated Numbers Half Pyramid\n");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i + 1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    //FLOYD'S Triangle pattern
    public static void FloydHalfPyramid(int rows) {
        System.out.println("\nFloyd's Half Pyramid\n");
        int counter = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    //0-1 triangle 
    public static void zeroOneTriangle(int rows){
        System.out.println("\nZero One Triangle\n\n");
        for(int i = 1;i <= rows; i++){
            for(int j = 1; j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    //Butterfly pattern
    public static void butterflyPattern(int rows){
        System.out.println("\nButterfly Pattern\n\n");
        //Upper Part
        for(int i =1; i<= rows;i++){
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            for(int j =1; j<= (2*rows-2*i);j++){
                System.out.print("  ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //Lower Part
        for(int i =rows; i>= 1;i--){ //only outer loop logic flips rest inner loops remains same 
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            for(int j =1; j<= (2*rows-2*i);j++){
                System.out.print("  ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //solid rhombus
    public static void solidRhombus(int rows){
        System.out.println("\n Solid Rhombus Pattern\n\n");
        for(int i = 1; i<=rows;i++){
            for(int j = 1; j<=(rows-i+1);j++){
                System.out.print(" ");
            }
            for(int j =1; j<=rows;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //hollow rhombus
    public static void hollowRhombus(int rows){
         System.out.println("\n Hollow Rhombus Pattern\n\n");
        for(int i =1; i<=rows;i++){
            for(int j = 1; j<=(rows-i+1);j++){
                System.out.print(" ");
            }
            for(int j =1; j<=rows;j++){
                if(i==1||i==rows||j==1||j==rows){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    //Diamond Pattern --> Upper pyramid and lowe pyramid 
    public static void diamond(int rows){
        System.out.println("\nDiamond Pattern\n\n");
        //upper half 
        for(int i =1; i<=rows; i++){
            //spaces
            for(int j = 1;j<=rows-i;j++){
                System.out.print("  ");
            }
            //stars
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
         //lower half 
        for(int i =rows; i>=1; i--){ //outer loop flips 
            //spaces
            for(int j=1;j<=rows-i;j++){
                System.out.print("  ");
            }
            //stars
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //number pyramid pattern 
    public static void numberPyramid(int rows){
        System.out.println("\nNumber Pyramid\n\n");
        for(int i =1; i <= rows;i++){
            //print spaces 
            for(int j = 1; j<=rows-i;j++){
                System.out.print("  ");
            }
            // print numbers  
            for(int j = 1; j <= (2*i)-1;j++){
                System.out.print(i+" ");
            }
            System.out.println(); // line break 
        }
    }

    //palandromic pyramid 
    public static void palandromicNumberPyramid(int rows){
        System.out.println("\nPalindrome Number Pyramid\n\n");
        for(int i =1; i <= rows;i++){
            //print spaces 
            for(int j = 1; j<=rows-i;j++){
                System.out.print("  "); //draw n-i spaces 
            }
            // print left numbers 
            for(int j = i; j>=1;j--){
                System.out.print(j+" "); 
            }
            //print right numbers 
            for(int j = 2; j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println(); // line break 
        }
    }

    public static void main(String[] args) {
        square(5); // square
        hollow(4); // hollow square
        rectangle(5, 4);
        hollow(5, 4); // hollow rectangle
        rotatedHalfPyramid(5); //Inverted Rotated Half Pyramid 
        numbersHlafPyramid(5); //Numers Inverted half pyramid 
        FloydHalfPyramid(4); //Floyd's Half Pyramid
        zeroOneTriangle(5); //Zero One Triangle
        butterflyPattern(5); //butterfly pattern
        solidRhombus(5); //solid rhombus
        hollowRhombus(5); //Holow rhombus
        diamond(5); //Diamond Pattern
        numberPyramid(5); //number pyramid 
        palandromicNumberPyramid((5));

    } //main method end 
} //pattern class end 
