import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        
        HashMap<String,Integer> playersMap = new HashMap<>();
     
        for (int i = 0; i<players.length; i++){
            playersMap.put(players[i],i);
        }
        
        for (String nowCalling : callings){
            int playerIndex = playersMap.get(nowCalling);
            String changedPlayer = players[playerIndex - 1];
            players[playerIndex - 1] = nowCalling;
            players[playerIndex] = changedPlayer;
            playersMap.put(nowCalling,playerIndex-1);
            playersMap.put(changedPlayer,playerIndex);
        }
        return players;
        }
    }
