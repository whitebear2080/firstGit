package basic.day06;

/*
수열과 구간 쿼리 3
제출 내역
문제 설명
정수 배열 arr와 2차원 정수 배열 queries이 주어집니다. queries의 원소는 각각 하나의 query를 나타내며, [i, j] 꼴입니다.

각 query마다 순서대로 arr[i]의 값과 arr[j]의 값을 서로 바꿉니다.

위 규칙에 따라 queries를 처리한 이후의 arr를 return 하는 solution 함수를 완성해 주세요.

제한사항
1 ≤ arr의 길이 ≤ 1,000
0 ≤ arr의 원소 ≤ 1,000,000
1 ≤ queries의 길이 ≤ 1,000
0 ≤ i < j < arr의 길이
입출력 예
arr	queries	result
[0, 1, 2, 3, 4]	[[0, 3],[1, 2],[1, 4]]	[3, 4, 1, 0, 2]
입출력 예 설명
입출력 예 #1

각 쿼리에 따라 arr가 다음과 같이 변합니다.
arr
[0, 1, 2, 3, 4]
[3, 1, 2, 0, 4]
[3, 2, 1, 0, 4]
[3, 4, 1, 0, 2]
따라서 [3, 4, 1, 0, 2]를 return 합니다.
 */


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution4 {
    public static void main(String[] args) {
        System.out.println(
                solution(new int[]{0, 1, 2, 3, 4}, new int[][]{{0, 3},{1, 2},{1, 4}})
        );

    }

    public static int[] solution(int[] arr, int[][] queries) {
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        for (int[] query : queries) {
            Collections.swap(list, query[0], query[1]);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
        /*
        for (int[] query : queries) {
            int temp = arr[query[0]];
            arr[query[0]] = arr[query[1]];
            arr[query[1]] = temp;
        }
        return arr;
        */
    }

}