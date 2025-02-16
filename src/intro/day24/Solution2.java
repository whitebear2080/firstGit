package intro.day24;

/*
이진수 더하기
제출 내역
문제 설명
이진수를 의미하는 두 개의 문자열 bin1과 bin2가 매개변수로 주어질 때, 두 이진수의 합을 return하도록 solution 함수를 완성해주세요.

제한사항
return 값은 이진수를 의미하는 문자열입니다.
1 ≤ bin1, bin2의 길이 ≤ 10
bin1과 bin2는 0과 1로만 이루어져 있습니다.
bin1과 bin2는 "0"을 제외하고 0으로 시작하지 않습니다.
입출력 예
bin1	bin2	result
"10"	"11"	"101"
"1001"	"1111"	"11000"

*/
public class Solution2 {

    public static void main(String[] args) {
        System.out.println(solution("10", "11"));
        System.out.println(solution("1001", "1111"));
    }

    public static String solution(String bin1, String bin2) {
        int num1 = Integer.parseInt(bin1, 2);
        int num2 = Integer.parseInt(bin2, 2);
        return Integer.toBinaryString(num1 + num2);
    }
}
