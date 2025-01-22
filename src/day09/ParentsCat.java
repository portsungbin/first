package day09;

class ParentsCat {
    private String bread = "샴 고양이";
    void methodParentCat() {
        System.out.println("어미고양이 냐옹!");
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }
}

class kitten extends ParentsCat {
    void methodKitten() {
        System.out.println("아기고양이 냐옹!");
    }

    }
