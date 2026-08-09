package ArraysAndStrings.SlidingWindow;

public class sliding_window {

    // Static sliding window templet
    int k=10;  //given
    int i=0;
    int j=0;

    while(j<nums.length){
        // calculation
        if(j-i+1<k){
            // Calculation
            // (1)Use ArrayList
            // (2)Use Queue
            // (3)Use stack
            j++;

        }
        else if(j-i+1==k){
            // find answer from calculation;
            // remove extra things
            i++;
            j++;
        }
    }
    
    /*
    
    | Operation Needed     | Meaning         |
| -------------------- | --------------- |
| Add/remove only      | simple variable |
| Check existence fast | Set             |
| Count frequency,Unique| Map            |
| Get first/oldest     | Queue           |
| Get max/min fast     | Deque           |


    */
}
