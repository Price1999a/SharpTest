import cn.edu.nju.stq.A;
import cn.edu.nju.stq.B;
import cn.edu.nju.stq.C;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    A a = new B();
    A a2 = new A();

    protected static final C c = new C();

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Main main = new Main();
        main.a.pubf1();
        main.a2.pubf2().pubf2().pubf1();
//        new Main().a2.pubf1();
//        if (main.a instanceof B) {
//            ((B) main.a).setRe(false);
//        }
        mainPrivateFunc();
        mainFuncAboutC();
//        c.setCa(main.a.pubf2());
//        main.a.pubf2().pubf1();
//        main.a = c.getCa();
//        c.setCa(main.a2);
    }

    private static void mainPrivateFunc() {
        final Main main = new Main();
        main.a = main.a2;
        main.a.pubf2().pubf2().pubf2();
        AtomicInteger x = new AtomicInteger();
        Thread thread = new Thread(() -> {
            synchronized (main) {
                x.getAndIncrement();
            }
        });
//        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        mainFuncAboutC();
        System.out.println("private static void mainPrivateFunc() done!");
    }

    public static void mainFuncAboutC() {
        A a1 = c.getCa();
        C.CFunc();
        c.setCa(new B());
    }
}