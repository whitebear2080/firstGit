package basic.day14;

/*
홀수 vs 짝수
제출 내역
문제 설명
정수 리스트 num_list가 주어집니다. 가장 첫 번째 원소를 1번 원소라고 할 때, 홀수 번째 원소들의 합과 짝수 번째 원소들의 합 중 큰 값을 return 하도록 solution 함수를 완성해주세요. 두 값이 같을 경우 그 값을 return합니다.

제한사항
5 ≤ num_list의 길이 ≤ 50
-9 ≤ num_list의 원소 ≤ 9
입출력 예
num_list	result
[4, 2, 6, 1, 7, 6]	17
[-1, 2, 5, 6, 3]	8
입출력 예 설명
입출력 예 #1

홀수 번째 원소들의 합은 4 + 6 + 7 = 17, 짝수 번째 원소들의 합은 2 + 1 + 6 = 9 이므로 17을 return합니다.
입출력 예 #2

홀수 번째 원소들의 합은 -1 + 5 + 3 = 7, 짝수 번째 원소들의 합은 2 + 6 = 8 이므로 8을 return합니다.
※2023년 04월 24일 테스트 케이스가 추가되었습니다. 기존에 제출한 코드가 통과하지 못할 수 있습니다.
 */

import java.util.stream.IntStream;

public class Solution1 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{4, 2, 6, 1, 7, 6}));
        System.out.println(solution(new int[]{-1, 2, 5, 6, 3}));
    }

    public static int solution(int[] num_list) {
        int oddSum = IntStream.range(0, num_list.length).filter(i -> i % 2 != 0).map(i -> num_list[i]).sum();
        int evenSum = IntStream.range(0, num_list.length).filter(i -> i % 2 == 0).map(i -> num_list[i]).sum();
        return Math.max(oddSum, evenSum);
    }
}
