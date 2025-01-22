package day10.jg;

import java.util.Scanner;

public class jgMain {
    public static void main(String[] args) {

        jgDTO jg1 = new jgDTO("pro1", "this1", 1000);
        jgDTO jg2 = new jgDTO("pro2", "this2", 2000);
        jgDTO jg3 = new jgDTO("pro3", "this3", 3000);

        jgDAO dao = new jgDAO(jg1, jg2, jg3);

        dao.printname();
        dao.printprice();
        dao.printexplain();
    }
}
