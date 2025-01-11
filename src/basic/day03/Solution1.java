package basic.day03;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
문자열 섞기
제출 내역
문제 설명
길이가 같은 두 문자열 str1과 str2가 주어집니다.

두 문자열의 각 문자가 앞에서부터 서로 번갈아가면서 한 번씩 등장하는 문자열을 만들어 return 하는 solution 함수를 완성해 주세요.

제한사항
1 ≤ str1의 길이 = str2의 길이 ≤ 10
str1과 str2는 알파벳 소문자로 이루어진 문자열입니다.
입출력 예
str1	str2	result
"aaaaa"	"bbbbb"	"ababababab"
 */
public class Solution1 {
    public static void main(String[] args) {
        System.out.println(solution("aaaaa", "bbbbb"));
    }

    public static String solution(String str1, String str2) {
        return IntStream.range(0, str1.length())
                .mapToObj(i -> String.valueOf(str1.charAt(i)).concat(String.valueOf(str2.charAt(i))))
                .collect(Collectors.joining());
    }
}
