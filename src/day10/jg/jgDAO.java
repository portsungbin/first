package day10.jg;

import java.util.Scanner;

public class jgDAO {
   
    private jgDTO jg1;
    private jgDTO jg2;
    private jgDTO jg3;

    public jgDAO() {
    }

    public jgDAO(jgDTO jg1, jgDTO jg2, jgDTO jg3) {
        this.jg1 = jg1;
        this.jg2 = jg2;
        this.jg3 = jg3;
    }


    public void printname() {
        System.out.println("이름은 : " + jg1.getName());

    }

    public void printprice() {
        System.out.println("가격은 : " + jg2.getPrice());
    }

    public void printexplain() {
        System.out.println("설명은 : " + jg3.getExplain());
    }



}
