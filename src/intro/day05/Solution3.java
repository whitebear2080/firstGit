package intro.day05;

/*
나이 출력
제출 내역
문제 설명
머쓱이는 선생님이 몇 년도에 태어났는지 궁금해졌습니다. 2022년 기준 선생님의 나이 age가 주어질 때, 선생님의 출생 연도를 return 하는 solution 함수를 완성해주세요

제한사항
0 < age ≤ 120
나이는 태어난 연도에 1살이며 매년 1월 1일마다 1살씩 증가합니다.
입출력 예
age	result
40	1983
23	2000
입출력 예 설명
입출력 예 #1

2022년 기준 40살이므로 1983년생입니다.
입출력 예 #2

2022년 기준 23살이므로 2000년생입니다.
※ 공지 - 2024년 3월 14일 문제 지문이 보다 명확하게 수정되었습니다.
 */
public class Solution3 {

    public static void main(String[] args) {
        System.out.println(solution(40));
    }

    public static int solution(int age) {
        return 2022 - age + 1;
    }
}
