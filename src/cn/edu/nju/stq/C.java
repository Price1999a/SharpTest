package cn.edu.nju.stq;

public class C {

    private A ca;

    public A getCa() {
        return ca;
    }

    public void setCa(A ca) {
        this.ca = ca;
    }

    public static void CFunc() {
        new C().getCa().pubf2().pubf1();
    }
}
