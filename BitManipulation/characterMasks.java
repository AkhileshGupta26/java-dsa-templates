package BitManipulation;

public class characterMasks {

/*

######## Think Like a Computer  #####

We have exactly 26 possible letters.
Let's assign one bit to each letter.

Bit Position
25 ......... 5 4 3 2 1 0
Letters
 z ......... f e d c b a

EXAMPLE -1

000...000001

Now
mask means
'a' exists. 






int mask = 0;

for(char c : word.toCharArray()){

    int bit = c - 'a';

    mask |= (1 << bit);
}

abc ->111
cde->11100

00111
   &
11100
------
00100 -> Not zero. -> Meaning -> Common letter exists.





int mask = 0;

for(char c : word.toCharArray()){

    int bit = c - 'a';

    // Duplicate check (optional)
    if((mask & (1 << bit)) != 0){
        // c already appeared
    }

    // Insert character
    mask |= (1 << bit);
}
































*/    
    
}
