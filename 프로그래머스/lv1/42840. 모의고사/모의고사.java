import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        
        int[] hateMath1 = new int[]{1,2,3,4,5};
        int[] hateMath2 = new int[]{2,1,2,3,2,4,2,5};
        int[] hateMath3 = new int[]{3,3,1,1,2,2,4,4,5,5};
        
        int get1 = 0;
        int get2 = 0;
        int get3 = 0;
        
        int j = 0;
        int k = 0;
        int l = 0;
        
        for(int i=0; i<answers.length; i++){
           j = i % 5;
           k = i % 8;
           l = i % 10;
           
           if(answers[i] == hateMath1[j]) get1++;
           if(answers[i] == hateMath2[k]) get2++;
           if(answers[i] == hateMath3[l]) get3++;     
              
        }
          List<Integer> result = new ArrayList<>();
          int max = Math.max(get1,Math.max(get2,get3));
          
          if( max == get1 ) result.add(1);
          if( max == get2 ) result.add(2);
          if( max == get3 ) result.add(3);
            
            return result.stream().mapToInt(i -> i).toArray(); 
        
            
     
    }
}