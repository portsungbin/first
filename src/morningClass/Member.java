package morningClass;

class Members {
    String name;
    String id;
    String password;
    int age;

    public Members(String name, String id) {
        this.name = name;
        this.id = id;
    }
}

class MemberService {
        public boolean login(String id, String password) {
            return true;
        }

        public void logout(String id) {
            System.out.println(id+"가 로그아웃되었습니다.");
        }
    }

class Printer {
    public void println(int age) {
        System.out.println(age);
    }
    public void println(boolean login) {
        System.out.println(login);
    }
    public void println(double d) {
        System.out.println(d);
    }
    public void println(String name) {
    System.out.println(name);
    }
}

public class Member {

    public static void main(String[] args) {
        Members user1 = new Members("홍길동", "hong");
        MemberService ms = new MemberService();
        boolean result = ms.login("hong", "12345");
        if(result) {
            System.out.println("로그인 되었습니다");
            ms.logout("hong");
        } else {
            System.out.println("id 또는 password가 올바르지 않습니다");
        }
        Printer p = new Printer();
        p.println(10);
        p.println(true);
        p.println(5.7);
        p.println("홍길동");

    }
}


