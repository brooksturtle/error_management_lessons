class lesson_3_debugger{
    /*
    there are two methods here. Each has a single error. You will use a debugger to find the error and 
    fix it. 
    Each method has instructions on what variables to keep track of as you debug. write those in a seperate file

    Remember. put a breakpoint at the beginning of the main method so you can step through the rest of the code
    
    */
       
   public static void main(String[] args) {
    int[] testArray = {0, 1, 4, 4, 5, 6, 8, 9 ,12, 13, 16, 17};
    
    // testing first method
    // searches for the number 13 within test array
    int result_index = binarySearch(testArray, 0, testArray.length -1, 13);
    System.out.println(result_index);

    // testing second method
    // int first_repeated_index = firstRepeated(testArray);
    // System.out.println(first_repeated_index);
   }

   /* Search for a specific number in an ordered array */
   /* This program has two mistakes in it. Use a debugger and test cases
   to find the two mistakes and describe them */

   // lower should usually start at 0 and upper should usually be array length - 1
   /*
   track upper, mid, mid_value, and lower through each loop
    using this as a test case
    // int[] testArray = {0, 1, 4, 4, 5, 6, 8, 9 ,12, 13, 16, 17};
   */
   public static int binarySearch(int[] myList, int lower, int upper, int target){
        while(lower <= upper){
            int mid = lower + (upper - lower) / 2;
            
            int mid_value = myList[mid];

            if (myList[mid] < target){
                lower = mid;
            }
            else if (myList[mid] > target){
                upper = mid - 1;
            }
            else if (myList[mid] == target){
                return mid;
            }
        }

        // if not found
        return -1;

    }
   
   /* gets index of first set of repeated numbers in a row
   example: {0, 1, 2, 5, 5, 4}
   returns 3, the index of the first 5*/
   // there is an error here use a debugger to go through and find the error

   // using debugger, what are the values of i, j, and arrayLength as we get to the end
   // what is the relationship between the length of an array and its index (arrays start at 0)
   public static int firstRepeated(int[] myList){
       int arrayLength = myList.length;
       for (int i = 0; i< arrayLength; i++){
           int j = i + 1;

            if (myList[i] == myList[j]){
                return i;
            }
       }
       // if no repeats return -1
       return -1;
   }

}