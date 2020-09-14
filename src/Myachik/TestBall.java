package Myachik;

public class TestBall {
    public static void main(String[] args) {
        Ball d1 = new Ball("Red", 15);
        Ball d2 = new Ball("Green", 2);
        Ball d3 = new Ball("Blue", 7);
        System.out.println(d1);
        d1.pechat();
        d2.pechat();
        d3.pechat();
    }
}
