class Solution {
    public int solution(int k, int[][] dungeons) {
     
        
        boolean[] visited = new boolean[dungeons.length];
        dfs(k, dungeons, visited);
        
        return max;
        
    }
    
    static int max = 0;
    
    public void dfs(int k, int[][] dungeons, boolean[] visited){
        
        int count = 0;
        for(int i = 0; i<visited.length; i++){
            if(visited[i]) count++ ;
        }
        if( count > max ) max = count ;
        
        for(int i = 0; i<dungeons.length; i++){
            if( !visited[i] && k >= dungeons[i][0] ){
                visited[i] = true;
                k -= dungeons[i][1];
                dfs(k, dungeons, visited);
                visited[i] = false;  
                k += dungeons[i][1];
              
            }
        }
    }
    
    
}