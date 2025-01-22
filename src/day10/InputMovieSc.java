package day10;

import java.util.Scanner;

public class InputMovieSc {
    static final Scanner input = new Scanner(System.in);

    public MovieDTO inputObject(MovieDTO movie) {
        System.out.println("영화 제목 입력");
        movie.title = input.nextLine();
        System.out.println("영화 개봉일 입력");
        movie.startDate = input.nextInt();
        input.nextLine();
        System.out.println("배우 이름 입력");
        movie.actor = input.nextLine();
        System.out.println("상영시간 입력");
        movie.runningTime = input.nextLine();
        System.out.println("영화 등급 입력");
        movie.grade = input.nextLine();
        System.out.println("영화 장르 입력");
        movie.gener = input.nextLine();


        return movie;
    }

}
