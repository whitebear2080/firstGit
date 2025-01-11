package intro.day02;

import java.util.Arrays;

/*
배열 두배 만들기
제출 내역
문제 설명
정수 배열 numbers가 매개변수로 주어집니다. numbers의 각 원소에 두배한 원소를 가진 배열을 return하도록 solution 함수를 완성해주세요.

제한사항
-10,000 ≤ numbers의 원소 ≤ 10,000
1 ≤ numbers의 길이 ≤ 1,000
입출력 예
numbers	result
[1, 2, 3, 4, 5]	[2, 4, 6, 8, 10]
[1, 2, 100, -99, 1, 2, 3]	[2, 4, 200, -198, 2, 4, 6]
입출력 예 설명
입출력 예 #1

[1, 2, 3, 4, 5]의 각 원소에 두배를 한 배열 [2, 4, 6, 8, 10]을 return합니다.
입출력 예 #2

[1, 2, 100, -99, 1, 2, 3]의 각 원소에 두배를 한 배열 [2, 4, 200, -198, 2, 4, 6]을 return합니다.
 */
public class Solution4 {
    public static void main(String[] args) {
        Arrays.stream(solution(new int[]{1, 2, 3, 4, 5})).forEach(System.out::println);
    }

    public static int[] solution(int[] numbers) {
        return Arrays.stream(numbers).map(n -> n * 2).toArray();
    }
}
