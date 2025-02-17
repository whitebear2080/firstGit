package intro.day25;

/*
다음에 올 숫자
제출 내역
문제 설명
등차수열 혹은 등비수열 common이 매개변수로 주어질 때, 마지막 원소 다음으로 올 숫자를 return 하도록 solution 함수를 완성해보세요.

제한사항
2 < common의 길이 < 1,000
-1,000 < common의 원소 < 2,000
common의 원소는 모두 정수입니다.
등차수열 혹은 등비수열이 아닌 경우는 없습니다.
등비수열인 경우 공비는 0이 아닌 정수입니다.
입출력 예
common	result
[1, 2, 3, 4]	5
[2, 4, 8]	16
입출력 예 설명
입출력 예 #1

[1, 2, 3, 4]는 공차가 1인 등차수열이므로 다음에 올 수는 5이다.
입출력 예 #2

[2, 4, 8]은 공비가 2인 등비수열이므로 다음에 올 수는 16이다.
*/
public class Solution4 {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4}));
        System.out.println(solution(new int[]{2, 4, 8}));
    }

    public static int solution(int[] common) {
        boolean isEqualSum = common[2] - common[1] == common[1] - common[0];
        if (isEqualSum) {
            return common[common.length-1] + (common[common.length-1] -  common[common.length-2]);
        } else {
            return common[common.length-1] * (common[common.length-1] / common[common.length-2]);
        }
    }
}
