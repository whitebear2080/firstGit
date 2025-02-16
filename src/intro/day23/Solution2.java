package intro.day23;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

/*
등수 매기기
제출 내역
문제 설명
영어 점수와 수학 점수의 평균 점수를 기준으로 학생들의 등수를 매기려고 합니다. 영어 점수와 수학 점수를 담은 2차원 정수 배열 score가 주어질 때, 영어 점수와 수학 점수의 평균을 기준으로 매긴 등수를 담은 배열을 return하도록 solution 함수를 완성해주세요.

제한사항
0 ≤ score[0], score[1] ≤ 100
1 ≤ score의 길이 ≤ 10
score의 원소 길이는 2입니다.
score는 중복된 원소를 갖지 않습니다.
입출력 예
score	result
[[80, 70], [90, 50], [40, 70], [50, 80]]	[1, 2, 4, 3]
[[80, 70], [70, 80], [30, 50], [90, 100], [100, 90], [100, 100], [10, 30]]	[4, 4, 6, 2, 2, 1, 7]
입출력 예 설명
입출력 예 #1

평균은 각각 75, 70, 55, 65 이므로 등수를 매겨 [1, 2, 4, 3]을 return합니다.
입출력 예 #2

평균은 각각 75, 75, 40, 95, 95, 100, 20 이므로 [4, 4, 6, 2, 2, 1, 7] 을 return합니다.
공동 2등이 두 명, 공동 4등이 2명 이므로 3등과 5등은 없습니다.
*/
public class Solution2 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[][]{{80, 70}, {90, 50}, {40, 70}, {50, 80}})));
        System.out.println(Arrays.toString(solution(new int[][]{{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}})));
    }

    static class Student {
        double average;
        int index;
        int rank;

        public Student(double average, int index) {
            this.average = average;
            this.index = index;
        }
    }

    public static int[] solution(int[][] score) {

        // 학생 객체 배열
        Student[] students = IntStream.range(0, score.length)
                .mapToObj(i -> new Student((score[i][0] + score[i][1]) / 2.0, i))
                .toArray(Student[]::new);

        // 평군 점수 기준으로 내림차순 정렬
        Student[] sortedStudents = Arrays.stream(students)
                .sorted(Comparator.comparingDouble((Student s) -> s.average).reversed())
                .toArray(Student[]::new);

        // 등수 계산
        for (int i = 0; i < sortedStudents.length; i++) {
            if (i > 0 && sortedStudents[i].average == sortedStudents[i - 1].average) {
                sortedStudents[i].rank = sortedStudents[i - 1].rank;
            } else {
                sortedStudents[i].rank = i + 1;
            }
        }

        return Arrays.stream(sortedStudents)
                .sorted(Comparator.comparingInt((Student s) -> s.index))
                .mapToInt(s -> s.rank)
                .toArray();
    }

}
