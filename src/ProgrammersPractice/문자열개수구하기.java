package ProgrammersPractice;

import java.util.ArrayList;
import java.util.List;

public class 문자열개수구하기 {

    public int generatePermutation(String word){

        List<String> permutation = new ArrayList<>();
        char[] arr = word.toCharArray();
        dfs(0, arr, permutation);
        return permutation.size();

    }

    private void dfs(int index, char[] arr, List<String> permutation) {

        if(index == arr.length){
            permutation.add(new String(arr)); //  permutation.add(arr); 를 하지 않는 이유는 후속 재귀 호출 시 변경 될 수 도 있음.
            return;
        }

        for(int i = index; i<arr.length; i++){
            change(arr,index,i);
            dfs(index + 1, arr,permutation);
            change(arr,index,i);
        }
    }

    public void change(char arr[], int i, int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
