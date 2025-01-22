package day10;

public class MovieDTO {
    //영화제목
    String title;
    //개봉일
    int startDate;
    //주인공
    String actor;
    //장르
    String gener;
    //러닝타임
    String runningTime;
    //등급
    String grade;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getStartDate() {
        return startDate;
    }

    public void setStartDate(int startDate) {
        this.startDate = startDate;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getGener() {
        return gener;
    }

    public void setGener(String gener) {
        this.gener = gener;
    }

    public String getRunningTime() {
        return runningTime;
    }

    public void setRunningTime(String runningTime) {
        this.runningTime = runningTime;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void moviePrint(MovieDTO movieDTO) {
        System.out.println(this.title);
        System.out.println("배우 : " + this.actor);
        System.out.print("장르 : " + this.gener + ", " + this.runningTime+", ");
        System.out.println("기본정보 : " + this.grade);
        System.out.println("개봉정보 : " + this.startDate);

    }

}
