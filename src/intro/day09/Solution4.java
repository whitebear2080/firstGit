package intro.day09;

/*
구슬을 나누는 경우의 수
제출 내역
문제 설명
머쓱이는 구슬을 친구들에게 나누어주려고 합니다. 구슬은 모두 다르게 생겼습니다. 머쓱이가 갖고 있는 구슬의 개수 balls와 친구들에게 나누어 줄 구슬 개수 share이 매개변수로 주어질 때, balls개의 구슬 중 share개의 구슬을 고르는 가능한 모든 경우의 수를 return 하는 solution 함수를 완성해주세요.

제한사항
1 ≤ balls ≤ 30
1 ≤ share ≤ 30
구슬을 고르는 순서는 고려하지 않습니다.
share ≤ balls
입출력 예
balls	share	result
3	2	3
5	3	10
입출력 예 설명
입출력 예 #1

서로 다른 구슬 3개 중 2개를 고르는 경우의 수는 3입니다. 스크린샷 2022-08-01 오후 4.15.55.png
입출력 예 #2

서로 다른 구슬 5개 중 3개를 고르는 경우의 수는 10입니다.
Hint
서로 다른 n개 중 m개를 뽑는 경우의 수 공식은 다음과 같습니다. 스크린샷 2022-08-01 오후 4.37.53.png
※ 공지 - 2022년 10월 11일 제한 사항 및 테스트케이스가 수정되었습니다.
*/
public class Solution4 {

    public static void main(String[] args) {
        System.out.println(solution(3, 2));
        System.out.println(solution(5, 3));
    }

    public static int solution(int balls, int share) {
        long answer = 1;
        int[] num1 = new int[share];
        int[] num2 = new int[share];

        int idx = 0;
        for (int i = balls; i > balls - share; i--) num1[idx++] = i;
        for (int i = 1; i <= share; i++) num2[i - 1] = i;
        for (int i = 0; i < num1.length; i++) answer = answer * num1[i] / num2[i];

        return Integer.parseInt(answer + "");
    }
}
