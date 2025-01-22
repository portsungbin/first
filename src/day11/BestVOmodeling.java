package day11;

import java.util.Scanner;

public class BestVOmodeling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("입력할 영화의 총개수를 입력하세요.");
        int movieTotal = scan.nextInt();
        scan.nextLine();
        System.out.println("각 영화당 상세정보의 개수를 입력하세요");
        int movieInfo = scan.nextInt();
        scan.nextLine();

        // 레벨업 : 5개의 영화를 배열로 관리하고 싶다 movieArray를 만들어 5개의 영화정보를 입력 한 후 해당 전체 영화리스트를 출력

        MovieVO[][] movieArray = new MovieVO[movieTotal][movieInfo];

        //3개의 영화의 상세정보목록의 개수는 3개(title, startDate, actor)
        //정보를 입력받고 해당 영화정보의 내용이 자동으로 movieArray에 할당되도록 만들어주세요

        for (int i = 0; i < movieTotal; i++) {
            MovieVO m1 = new MovieVO();
            System.out.println("영화 제목을 입력하세요");
            m1.setTitle(scan.nextLine());
            System.out.println("영화 개봉일을 입력하세요");
            m1.setStartDate(scan.nextLine());
            System.out.println("영화 배우을 입력하세요");
            m1.setActor(scan.nextLine());
            System.out.println("영화 장르을 입력하세요");
            m1.setGener(scan.nextLine());
            System.out.println("영화 상영시간을 입력하세요");
            m1.setRunningTime(scan.nextLine());

            movieArray[i][0] = m1;


        }
        for (int i = 0; i < movieTotal; i++) {
            MovieVO m2 = movieArray[i][0];
            System.out.println(m2.toString());

        }


//        MovieVO avata1 = new MovieVO("아바타", "2022.12.14", "제이크 설리","액션", "192");
//        MovieVO avata2 = new MovieVO("아바타", "2022.12.14", "제이크 설리","액션", "192");
//        MovieVO avata3 = new MovieVO("아바타", "2022.12.14", "제이크 설리","액션", "192");
//        MovieVO avata4 = new MovieVO("아바타", "2022.12.14", "제이크 설리","액션", "192");
//        MovieVO avata5 = new MovieVO("아바타", "2022.12.14", "제이크 설리","액션", "192");


    }
}
