import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        // 정답을 담을 배열 생성
        int comLen = commands.length;
        int[] answer = new int[comLen];
        // commands 배열의 요소 하나씩 돌면서
        for(int i = 0; i < comLen; i++){
            int start = commands[i][0]-1;
            int end = commands[i][1];
        // commands[i][0]-1 번째부터 commands[i][1]번째까지 copyOfRange 하고
            int[] copy = Arrays.copyOfRange(array,start,end);
        // 그렇게 새로 만들어진 배열을 정렬
            Arrays.sort(copy);
        // 거기서 [k-1] 번째 요소를 정답 배열에 i번째에 넣기
            answer[i] = copy[commands[i][2]-1];
        }
        // 모두 반복 후 정답 배열 리턴.
        return answer;
    }
}