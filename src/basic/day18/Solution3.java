package basic.day18;

/*
간단한 식 계산하기
제출 내역
문제 설명
문자열 binomial이 매개변수로 주어집니다. binomial은 "a op b" 형태의 이항식이고 a와 b는 음이 아닌 정수, op는 '+', '-', '*' 중 하나입니다. 주어진 식을 계산한 정수를 return 하는 solution 함수를 작성해 주세요.

제한사항
0 ≤ a, b ≤ 40,000
0을 제외하고 a, b는 0으로 시작하지 않습니다.
입출력 예
binomial	result
"43 + 12"	55
"0 - 7777"	-7777
"40000 * 40000"	1600000000
입출력 예 설명
입출력 예 #1

예제 1번의 binomial은 "43 + 12"로 이 식을 계산한 결과인 43 + 12 = 55를 return 합니다.
입출력 예 #2

예제 2번의 binomial은 "0 - 7777"로 이 식을 계산한 결과인 0 - 7777 = -7777을 return 합니다.
입출력 예 #3

예제 3번의 binomial은 "40000 * 40000"으로 이 식을 계산한 결과인 40000 × 40000 = 1600000000을 return 합니다.
 */

public class Solution3 {
    public static void main(String[] args) {
        System.out.println(solution("43 + 12"));
        System.out.println(solution("0 - 7777"));
        System.out.println(solution("40000 * 40000"));
    }

    public static int solution(String binomial) {
        /*
        String[] arr = Arrays.stream(binomial.split(" "))
                .filter(s -> !s.isEmpty())
                .map(s -> s.replaceAll(" ", ""))
                .toArray(String[]::new);
         */
        String[] arr = binomial.split(" ");
        int a = Integer.parseInt(arr[0]), b = Integer.parseInt(arr[2]);
        String op = arr[1];
        return switch (op) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            default -> throw new IllegalStateException("Unexpected value: " + op);
        };
    }
}

