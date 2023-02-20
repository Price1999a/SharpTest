package cn.edu.nju.stq;

public class A {
    private void prif1(int x) {
        x++;
    }

    public void pubf1() {
        prif1(0);
    }

    public A pubf2() {
        return this;
    }
}
