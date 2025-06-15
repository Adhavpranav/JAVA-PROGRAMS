class Info {
    static int b = 20;

    static void show() {
        int num = 10;
        System.out.println(num);
        System.out.println(b);
        add();
    }

    static void add() {
        System.out.println("ADD " + (10 + 10));
    }
}

public class StaticMethodDemo {
    public static void main(String[] args) {
        Info.show();
    }
}
