import java.util.ArrayList;
/*
ArrayList Guide

ArrayList<MyClass> myList = new ArrayList<MyClass>(); //switch MyClass with String, int, double, object name
to add:
myList.add(yourElement)
to remove by index:
myList.remove(index)
to get value at index:
myList.get(index)
*/

/*
to compile:
javac lesson_2_error_management.java
to run:
java lesson_2_error_management
*/

/*
This programs adds words to an arrayList, then lets you perform some simple functions on them.
fill in methods in this order, and use the test code to test each method one 
at a time before going on
*/

public class lesson_2_error_management{
    public static void main(String[] args){
        // create arrayList
        ArrayList<String> myArray = new ArrayList<String>();

        // test addWord
        myArray = addWord("yeti", myArray);
        String newWord = "iceland";
        myArray = addWord(newWord, myArray);
        myArray = addWord("snow", myArray);
        myArray = addWord("bigfoot", myArray);
        myArray = addWord("octopus", myArray);
        // see if all were added correctly: yeti iceland snow bigfoot octopus
        printStringArray(myArray);

    }

    /*
    should simply add the word to the ArrayList, then return the arraylist
    this one is already filled out.
    */
    public static ArrayList<String> addWord(String word, ArrayList<String> stringArray){
        stringArray.add(word);
        return stringArray;
    }

    /*
    delete the word at a specific index from list, then return arraylist. Should be simple
    check to make sure the index is in bounds, if not print index out of bounds and pass
    */
    /*
    public static ArrayList<String> deleteWord(int index, ArrayList<String> stringArray){
        
    }
    */
    

    /*
    Search through the array list element by element. If the element matches the 
    searchWord, return the elements index. If the word is not found, return -1
    */
    /*
    public static int searchForWord(String searchWord, ArrayList<String> stringArray){
  
    }
    */

    /*
    use searchForWord function to check if word exists in the arrayList. If it does,
    delete word by index. Else, pass.
    */
    /*
    public static ArrayList<String> deleteWordByValue(String wordToDelete, ArrayList<String> stringArray){
    }
    */
    

    /* should return the reverse of each word,
    if "fire" is input "erif" should be returned */
    /*
    public static String reverseString(String word){
        
    }
    */

    /* reverse the word using other methods and add only the reverse to the arrayList
    given "fire", reverse "erif", add "erif" to arrayList */
    /*
    public static ArrayList<String> addReversedWord(String word, ArrayList<String> stringArray){

    }
    */

    /* prints arrayList elementwise, use this for testing
    no need to touch
    */
    public static void printStringArray(ArrayList<String> stringArray){
        for (int i = 0; i < stringArray.size(); i++){
            System.out.println(stringArray.get(i));
        }
    }
}