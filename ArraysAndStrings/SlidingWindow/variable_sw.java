package ArraysAndStrings.SlidingWindow;

public class variable_sw {

    // ALWAYS TRY TO FIND 3 THINGS:
    // (1)VALID
    // (2)INVALID
    // (3)What to remove when invalid
    /*
    
    1. EXPAND (j++)
    2. FIX if INVALID (shrink i++)
    3. NOW window is VALID
    4. UPDATE answer

    */

// main thing is to find condition in dynamic sliding window problems 
    boolean condition;

    int i=0;
    int j=0;

    // MOST USED DATA STRUCTURE IS HASHMAP

    while(j<nums.length){
           // calculation
        if(condition<k){

            j++;

        }
        if(condition==k){
            j++;

        }
        if(condition>k){
            while(condition==true){
                // remove
                i++;
            }
        }
    }
    
}
