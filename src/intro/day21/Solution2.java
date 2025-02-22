package intro.day21;

/*
안전지대
제출 내역
문제 설명
다음 그림과 같이 지뢰가 있는 지역과 지뢰에 인접한 위, 아래, 좌, 우 대각선 칸을 모두 위험지역으로 분류합니다.
image.png
지뢰는 2차원 배열 board에 1로 표시되어 있고 board에는 지뢰가 매설 된 지역 1과, 지뢰가 없는 지역 0만 존재합니다.
지뢰가 매설된 지역의 지도 board가 매개변수로 주어질 때, 안전한 지역의 칸 수를 return하도록 solution 함수를 완성해주세요.

제한사항
board는 n * n 배열입니다.
1 ≤ n ≤ 100
지뢰는 1로 표시되어 있습니다.
board에는 지뢰가 있는 지역 1과 지뢰가 없는 지역 0만 존재합니다.
입출력 예
board	result
[[0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 1, 0, 0], [0, 0, 0, 0, 0]]	16
[[0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 1, 1, 0], [0, 0, 0, 0, 0]]	13
[[1, 1, 1, 1, 1, 1], [1, 1, 1, 1, 1, 1], [1, 1, 1, 1, 1, 1], [1, 1, 1, 1, 1, 1], [1, 1, 1, 1, 1, 1], [1, 1, 1, 1, 1, 1]]	0
입출력 예 설명
입출력 예 #1

(3, 2)에 지뢰가 있으므로 지뢰가 있는 지역과 지뢰와 인접한 위, 아래, 좌, 우, 대각선 총 8칸은 위험지역입니다. 따라서 16을 return합니다.
입출력 예 #2

(3, 2), (3, 3)에 지뢰가 있으므로 지뢰가 있는 지역과 지뢰와 인접한 위, 아래, 좌, 우, 대각선은 위험지역입니다. 따라서 위험지역을 제외한 칸 수 13을 return합니다.
입출력 예 #3

모든 지역에 지뢰가 있으므로 안전지역은 없습니다. 따라서 0을 return합니다.
*/
public class Solution2 {

    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}}));
    }

    public static int solution(int[][] board) {
        int answer = 0;
        int length = board.length;   //길이
        int[][] temp = new int[length+2][length+2];
        // 길이를 2 늘린 액자용 배열 생성 -> 이러면 단순한 조건식으로 안전영역 구할 수 있음

        // 액자에 board 이식.
        for(int i=1; i<length+1; i++){
            for(int j=1; j<length+1;j++){
                temp[i][j]=board[i-1][j-1];
            }
        }

        //위험지대 찾기
        for(int i=1; i<length+1; i++){
            for(int j=1; j<length+1;j++){
                if(temp[i][j]==1){
                    for(int a = i-1; a<=i+1; a++){
                        for(int b =j-1; b<=j+1; b++){
                            if(temp[a][b]!=1) temp[a][b]=2;
                        }
                    }
                }
            }
        }

        // 안전지대 카운트
        for(int i=1; i<length+1; i++){
            for(int j=1; j<length+1;j++){
                if(temp[i][j]==0) answer++;
                System.out.print(temp[i][j]);
            }
            System.out.println("");
        }

        return answer;
    }
}
