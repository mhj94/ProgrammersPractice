package ProgrammersPractice;

import java.util.ArrayList;
import java.util.Collections;

/*
* 코딩테스트 연습 > 깊이/너비 > 우선 탐색(DFS/BFS) > 여행경로
*
* 주어진 항공권을 모두 이용하여 여행경로를 짜려고 합니다. 항상 "ICN" 공항에서 출발합니다.
* 항공권 정보가 담긴 2차원 배열 tickets가 매개변수로 주어질 때, 방문하는 공항 경로를
* 배열에 담아 return 하도록 solution 함수를 작성해주세요.
*
*
**/
public class 여행경로 {

    boolean[] usedTicket;
    ArrayList<String> list = new ArrayList<>();

    public String[] solution(String[][] tickets) {

        usedTicket = new boolean[tickets.length];
        dfs("ICN", "ICN", 0, tickets);

        Collections.sort(list);

        return list.get(0).split(" ");

    }

    private void dfs(String startCity, String travelCities, int count, String[][] tickets) {

        if(count == tickets.length){
            list.add(travelCities);
            return;
        }

        for(int i = 0; i< tickets.length; i++){

            if(!usedTicket[i] && tickets[i][0].equals(startCity)){

                usedTicket[i] = true;
                dfs(tickets[i][1], travelCities + " " + tickets[i][1],count + 1,tickets);
                usedTicket[i] = false;
            }
        }

    }
}
