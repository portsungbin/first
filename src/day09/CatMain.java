package day09;

public class CatMain {
    public static void main(String[] args) {
        ParentsCat momCat = new ParentsCat();
        //String bread = momCat.bread;
        //System.out.println("어미고양이 좋은 " + bread);
        momCat.methodParentCat();

        //어미 고양이 monCat1 한마리를 더 생성해 보세요
        ParentsCat momCat1 = new ParentsCat();
        //momCat1.bread = "점박이";
        momCat1.getBread();
        momCat1.methodParentCat();

        //System.out.println(momCat1.bread);
        momCat.methodParentCat();

        kitten kitty1 = new kitten();
        //kitten bread = "스핑크스고양이";
        kitty1.setBread("고양이");
        //System.out.println(kitty1.bread);
        kitty1.getBread();
        kitty1.methodParentCat();
        kitty1.methodKitten();

    }
}
