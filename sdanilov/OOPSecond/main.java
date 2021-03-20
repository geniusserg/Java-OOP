package sdanilov.OOPSecond;

public class main {
    public static void main(String[] args){
        MyComplex mc = new MyComplex(9,-8);
        System.out.println(mc.divide(mc).conjugate().add(mc).argument());
        MyPolinomial mp = new MyPolinomial(new double[]{1.0, 1.0, 9.0, 6.99});
        System.out.println(mp);
        System.out.println(mp.multiply(mp).multiply(mp));
        Ball ball = new Ball(8,9,7,9,45);
        ball.move();
        System.out.println(ball);
    }
}
