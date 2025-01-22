package day11;

public class MovieVO {
    //영화제목
    private String title;
    //개봉일
    private String startDate;
    //주인공
    private String actor;
    //장르
    private String gener;
    //러닝타임
    private String runningTime;


    public MovieVO() {
    }

    public MovieVO(String title, String startDate, String actor, String gener, String runningTime) {
        this.title = title;
        this.startDate = startDate;
        this.actor = actor;
        this.gener = gener;
        this.runningTime = runningTime;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
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

    @Override
    public String toString() {
        return "MovieVO{" +
                "title='" + title + '\'' +
                ", startDate='" + startDate + '\'' +
                ", actor='" + actor + '\'' +
                ", gener='" + gener + '\'' +
                ", runningTime='" + runningTime + '\'' +
                '}';
    }
}
