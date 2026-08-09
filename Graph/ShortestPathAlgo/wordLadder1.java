package Graph.ShortestPathAlgo;

public class wordLadder1 {
/*

class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {

        Set<String> st = new HashSet<>(wordList);

        if (!st.contains(endWord))
            return 0;

        Queue<Pair<String, Integer>> q = new LinkedList<>();

        q.offer(new Pair<>(beginWord, 1));

        st.remove(beginWord);

        while (!q.isEmpty()) {

            String word = q.peek().getKey();
            int steps = q.peek().getValue();
            q.poll();

            if (word.equals(endWord))
                return steps;

            for (int i = 0; i < word.length(); i++) {

                char[] arr = word.toCharArray();

                char original = arr[i];

                for (char ch = 'a'; ch <= 'z'; ch++) {

                    if (ch == original)
                        continue;

                    arr[i] = ch;

                    String newWord = new String(arr);

                    if (st.contains(newWord)) {

                        st.remove(newWord);

                        q.offer(new Pair<>(newWord, steps + 1));
                    }
                }
            }
        }

        return 0;
    }
}

class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}





*/    
    
}
