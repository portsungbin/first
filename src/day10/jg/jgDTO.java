package day10.jg;

public class jgDTO {
    private String name;
    private String explain;
    private int price;

    public jgDTO() {
    }

    public jgDTO(String name,  String explain, int price) {
        this.name = name;
        this.explain = explain;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }
}
