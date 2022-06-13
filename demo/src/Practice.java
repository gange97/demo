import java.util.ArrayList;

public class Practice {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.outB());
        System.out.println(b.outPut());
        System.out.println(b.getmNUm());
        ArrayList<Object> objects = new ArrayList<>();
        ArrayList<Integer> int = new ArrayList<>();
    }

}
class B extends A{
    public int outB() {
        return 888;
    }
    public int getmNUm() {
        return super.getmNUm() + 1;
    }
}


class A {
    private int mNUm = 1;
    public int outPut() {
        return 777;
    }

    public int getmNUm() {
        return mNUm;
    }

    private void pri() {
        System.out.println(111);
    }
}
