public class lesson_1{
   
    /*
    This program multiplies two numbers together,
    then prints if the product is greater or less than zero
    then prints out the product
    */
   public static void main(String[] args) {
    
    double multiplier = 2.0;
    int starting_value = "4";
    
    new_value = 0;

    // for this error check the two inputs to the multiplication method.
    new_value = multiplication(multiplier, starting_value);

    printPosNeg(new_value);
    printValue(new_value);

   }

   /*multiplies two numbers and returns product
   */
   public static int multiplication(int n1, int n2) {
        int multiplication_product = n1 * n2;

   }

   /*
   prints if value is less than or equal to zero
   */
   public void printPosNeg(int product){
        if (product <= 0){
            System.out.println("Product is less than or equal to zero");
            return;
        }
        else {
            System.out.println("Product is greater than zero");
            return;
        }
        
        // how would we get here? what is the point of this line?
        System.out.println("Product is something else");
   }

   /*
   prints out value 
   */
   public void printValue(int value){
       System.out.println("The value is " + value);
   }

}

