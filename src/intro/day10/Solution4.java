package intro.day10;

import java.util.Arrays;
import java.util.stream.IntStream;

/*
배열 회전시키기
제출 내역
문제 설명
정수가 담긴 배열 numbers와 문자열 direction가 매개변수로 주어집니다. 배열 numbers의 원소를 direction방향으로 한 칸씩 회전시킨 배열을 return하도록 solution 함수를 완성해주세요.

제한사항
3 ≤ numbers의 길이 ≤ 20
direction은 "left" 와 "right" 둘 중 하나입니다.
입출력 예
numbers	direction	result
[1, 2, 3]	"right"	[3, 1, 2]
[4, 455, 6, 4, -1, 45, 6]	"left"	[455, 6, 4, -1, 45, 6, 4]
입출력 예 설명
입출력 예 #1

numbers 가 [1, 2, 3]이고 direction이 "right" 이므로 오른쪽으로 한 칸씩 회전시킨 [3, 1, 2]를 return합니다.
입출력 예 #2

numbers 가 [4, 455, 6, 4, -1, 45, 6]이고 direction이 "left" 이므로 왼쪽으로 한 칸씩 회전시킨 [455, 6, 4, -1, 45, 6, 4]를 return합니다.
*/
public class Solution4 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3}, "right")));
        System.out.println(Arrays.toString(solution(new int[]{4, 455, 6, 4, -1, 45, 6}, "left")));
    }

    public static int[] solution(int[] numbers, String direction) {
        return switch (direction) {
            case "right" -> IntStream.concat(
                    IntStream.of(numbers[numbers.length - 1]) //마지막 원소를 첫번째로
                    , IntStream.range(0, numbers.length - 1).map(i -> numbers[i])) //마지막 제외 나머지
                    .toArray();
            case "left" -> IntStream.concat(
                    IntStream.range(1, numbers.length).map(i -> numbers[i]) //첫 번째 제외 나머지
                    , IntStream.of(numbers[0]) //첫 번째를 마지막으로
                    ).toArray();
            default -> throw new IllegalStateException("Unexpected value: " + direction);
        };
    }
}
