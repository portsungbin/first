package day08.String;

public class StringPerfoEx {
    public static void main(String[] args) {
        StringBuffer StringBuffer = new StringBuffer();
        StringBuilder StringBuilder = new StringBuilder();

        new Thread(()-> {
            for (int i = 0; i < 100000; i++) {
                StringBuffer.append(1);
                StringBuilder.append(1);
            }

        }).start();

        new Thread(()-> {
            for (int i = 0; i < 100000; i++) {
                StringBuffer.append(1);
                StringBuilder.append(1);
            }

        }).start();

        new Thread(()->{
            try{
                Thread.sleep(2000);

                System.out.println("StringBuffer.length : " + StringBuffer.length());
                System.out.println("StringBuilder.length : " + StringBuilder.length());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();





    }
}
