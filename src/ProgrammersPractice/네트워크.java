package ProgrammersPractice;

public class 네트워크 {
    int answer = 0;
    static boolean[] visited = new boolean[200];
    public int solution(int n, int[][] computers) {
        for(int i = 0; i<n; i++) {
            if (!visited[i]) {
                answer++;
                dfs(i, computers);
            }
        }
        return answer;
    }

    public void dfs(int n, int[][] computers){
        if(visited[n]){
            return;
        }

        visited[n] = true;
        for(int i = 0; i<computers.length; i++){

            if(computers[n][i]==1){
                dfs(i,computers);
            }
        }
    }
}
