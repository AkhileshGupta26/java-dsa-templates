package MicroTools.ConversionAndOverflow;

public class IntegerOverflow {
/*


This is the most common bug.

int a = 100000;
int b = 100000;

long ans = a * b;

Expected -> 10000000000
Actual ->1410065408


##### The 1L Trick ⭐⭐⭐⭐⭐

✅ Correct
long ans = 1L * a * b;

✅ Correct
long ans = (long)a * b;

❌ Wrong
long ans = a * b;

❌ Wrong
long ans = (long)(a * b);



##### The 1.0 Trick ⭐⭐⭐⭐⭐

Suppose
int a = 5;
int b = 2;
System.out.println(a/b);
Output :2

Need decimal?
System.out.println(1.0*a/b);


###### Ceiling Division ⭐⭐⭐⭐⭐
10/3 = 4

Instead of :Math.ceil((double)a/b)
Use :(a+b-1)/b



##### Long Literal 'L'

✅ Correct
long x = 10000000000L;

long x = 100;
This works because 100 fits inside an int, and Java automatically widens it to long.
But now consider:
long x = 10000000000;
❌ Compilation Error!

















*/    
    
}
