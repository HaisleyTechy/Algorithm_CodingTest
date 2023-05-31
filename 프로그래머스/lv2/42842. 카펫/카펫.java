class Solution {
    public int[] solution(int brown, int yellow) {
        
        int[] answer = new int[2];
        int sum = brown + yellow ;
        // yellow == ( length - 2 )((sum/length)-2)
        // 또는 brown == 2(length + sum/length) - 4
        for(int i = sum/2; i > 2; i-- ){
            if( sum % i == 0 && 2*(i + sum/i) - 4 == brown ){
                answer[0] = i ;
                answer[1] = sum / i ;
                break;
            }
        }
        return answer;   
    }
}