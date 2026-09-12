package ArraysAndStrings.HashMap;
import java.util.*;
public class basics {
    public static void main(String[] args) {
         HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(10,20);
        hm.put(50,100);
        hm.put(10,20);
        System.out.println(hm);
        // key travel
        for(int key:hm.keySet()){
            System.out.println(key);
            System.out.println(hm.get(key));
        }
        //value trqversal
        for(int val:hm.values()){
            System.out.println(val);
        }
        // travel at key value simultaneously
        for(var v:hm.entrySet()){
            int key=v.getKey();
            int val=v.getValue();
            System.out.println(key+"->"+val);
        }
        System.out.println(hm.get(50));
        System.out.println(hm.containsValue(100));
        ArrayList<Map.Entry<Integer,Integer>> list=new ArrayList<>(hm.entrySet());
        System.out.println(list);


        //OUTPUT
 {50=100, 10=20}
50
100
10
20
100
20
50->100
10->20
100
true
[50=100, 10=20]
        

    }
    
}
