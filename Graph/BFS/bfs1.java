package Graph.BFS;
import java.util.*;
import java.util.List;
import java.util.Queue;

public class bfs1 {

    static void bfs(List<List<Integer>> list,int start,int n){
        Queue<Integer> q=new LinkedList<>();
        boolean []visited=new boolean[n];

        q.offer(start);
        visited[start]=true;

        while(!q.isEmpty()){
            int node=q.poll();

            for(int a:list.get(node)){
                if(!visited[a]){
                    visited[a]=true;
                    q.offer(a);
                }
            }

        }



    }
    
}
