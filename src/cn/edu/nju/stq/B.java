package cn.edu.nju.stq;

public class B extends A {
    boolean re;

    @Override
    public void pubf1() {
        super.pubf1();
        if (re)
            this.pubf1();
    }

    public void setRe(boolean re) {
        this.re = re;
    }
}
