import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        
        int max0 = 0;
        int max1 = 0;
        for(int i=0; i<sizes.length; i++){
            Arrays.sort(sizes[i]);
            if ( sizes[i][0] > max0 ) max0 = sizes[i][0];
            if ( sizes[i][1] > max1 ) max1 = sizes[i][1];
        }
        return max0 * max1 ;
    }
}