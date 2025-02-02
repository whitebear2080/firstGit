package intro.day16;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

/*
가장 큰 수 찾기
제출 내역
문제 설명
정수 배열 array가 매개변수로 주어질 때, 가장 큰 수와 그 수의 인덱스를 담은 배열을 return 하도록 solution 함수를 완성해보세요.

제한사항
1 ≤ array의 길이 ≤ 100
0 ≤ array 원소 ≤ 1,000
array에 중복된 숫자는 없습니다.
입출력 예
array	result
[1, 8, 3]	[8, 1]
[9, 10, 11, 8]	[11, 2]
입출력 예 설명
입출력 예 #1

1, 8, 3 중 가장 큰 수는 8이고 인덱스 1에 있습니다.
입출력 예 #2

9, 10, 11, 8 중 가장 큰 수는 11이고 인덱스 2에 있습니다.
*/
public class Solution2 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 8, 3})));
        System.out.println(Arrays.toString(solution(new int[]{9, 10, 11, 8})));
    }

    public static int[] solution(int[] array) {
        return IntStream.range(0, array.length)
                .boxed()
                .max(Comparator.comparingInt(i -> array[i]))
                .map(i -> new int[]{array[i], i})
                .orElse(new int[]{0, 0});
        /*
        int max = 0, idx = 0;
        for (int i = 0; i < array.length; i++) {
            if (i > max) {
                max = array[i];
                idx = i;
            }
        }
        return new int[]{max, idx};
         */
    }
}
