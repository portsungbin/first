package day08.ioEx;

import java.io.*;
import java.util.Objects;


public class Ex {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int[] b = null;
        int sum = 0;
        int avgcount = 0;


        while (true) {
            bw.write("------------------------------------------------\n");
            bw.write("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료\n");
            bw.write("------------------------------------------------\n");
            bw.write("선택> ");
            bw.flush();

            String input = br.readLine();

            switch (input) {
                case "1":
                    bw.write("학생수> ");
                    bw.flush();
                    int a = Integer.parseInt(br.readLine());
                    b = new int[a];
                    break;

                case "2":
                    if (b == null) {
                        bw.write("학생 수 먼저 입력하세요.\n");
                        bw.flush();
                        break;
                    }
                    for (int i = 0; i < b.length; i++) {
                        bw.write("scores[" + i + "]> ");
                        bw.flush();
                        b[i] = Integer.parseInt(br.readLine());

                    }
                    break;

                case "3":
                    if (b == null) {
                        bw.write("점수가 입력되지 않았습니다.\n");
                        bw.flush();
                        break;
                    }
                    for (int i = 0; i < b.length; i++) {
                        bw.write("scores[" + i + "]> " + b[i] + "\n");
                        bw.flush();

                    }
                    break;

                case "4":
                    if (b == null) {
                        bw.write("점수가 입력되지 않았습니다.\n");
                        bw.flush();
                        break;
                    }

                    for (int i : b) {
                        sum += i;
                        avgcount++;
                    }
                    double avg = (double)sum/avgcount;

                    String formatavg = String.format("%.1f", avg);

                    bw.write("최고 점수 : " + sum + "\n");
                    bw.write("평균 점수 : " + formatavg + "\n");
                    bw.flush();

                    break;

                case "5":
                    bw.write("프로그램 종료");
                    bw.flush();
                    bw.close();
                    br.close();
                    return;

                default:
                    bw.write("잘못입력되었습니다.\n");
                    bw.flush();
                    break;
            }


        }


    }
}
