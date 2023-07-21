package ProgrammersPractice;

public class 타겟넘버 {
    int answer = 0;
    public int solution(int[] numbers, int target) {

        dfs(numbers, target, 0, 0);

        return answer;

    }

    public void dfs(int[] numbers, int target, int total, int index){
        if(index == numbers.length){
            if(total == target){
                answer++;
            }
            return;

        }
        dfs(numbers, target, total+numbers[index], index + 1);
        dfs(numbers, target, total-numbers[index], index + 1);

    }


}
