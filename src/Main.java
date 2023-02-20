import cn.edu.nju.stq.A;
import cn.edu.nju.stq.B;

public class Main {
    A a = new B();
    A a2 = new A();

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Main main = new Main();
        main.a.pubf1();
        main.a2.pubf2().pubf2().pubf1();
        new Main().a2.pubf1();
    }
}