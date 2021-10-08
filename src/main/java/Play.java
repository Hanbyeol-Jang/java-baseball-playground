import java.util.Scanner;

public class Play {

    public static void main(String[] args) {

        String com = "425";
        Scanner sc = new Scanner(System.in);

        int strike = 0;
        int ball = 0;

        while (true) {
            System.out.print("숫자를 입력해 주세요 : ");

            String value = sc.nextLine();
            String[] values = value.split("");

            strike = 0;
            ball = 0;

            for (int i = 0; i < 3; i++) {
                if (com.contains(values[i])) {
                    if (values[i].equals(com.charAt(i) + "")) {
                        strike++;
                    } else {
                        ball++;
                    }
                }
            }

            System.out.println(ball + " 볼 " + strike + " 스트라이크");

            if (strike == 3) {
                System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
                System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
                String newGame = sc.nextLine();

                if (newGame.equals("1")) {
                    continue;
                } else if (newGame.equals("2")) {
                    break;
                }

            }
        }

    }
}
