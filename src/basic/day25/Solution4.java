package basic.day25;

/*
v
 */

public class Solution4 {
    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{0, 1, 2},{1, 2, 3},{2, 3, 4},{3, 4, 5}}, 2));
    }

    public static int solution(int[][] board, int k) {
        int answer = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (i + j <= k)
                    answer += board[i][j];
            }
        }
        return answer;
    }
}

