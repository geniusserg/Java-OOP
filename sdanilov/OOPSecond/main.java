package sdanilov.OOPSecond;

/**
 * Function main for testing OOPSecond classes
 * 
 * Author: Danilov Sergey
 * 
 * Date: 3/19/2021
 */

public class main {
    public static void main(String[] args){
        System.out.println("OOP Second homework");
        MyComplex mc = new MyComplex(9,-8);
        System.out.println(mc.divide(mc).conjugate().add(mc).argument());
        MyPolinomial mp = new MyPolinomial(new double[]{1.0, 1.0, 9.0, 6.99});
        System.out.println(mp);
        System.out.println(mp.multiply(mp).multiply(mp));

        /* Ball and Container */

        Ball ball = new Ball(8,9,7);
        Container ct = new Container(0, 0, 100, 100);
        System.out.println(ct.collides(ball));
        ball.setSpeedVector(7, 30);
        ball.move();
        ball.putInContainer(ct);
        System.out.println(ball);
        ball.setSpeed(70);
        ball.move();
        System.out.println(ball);
        ball.reflectHorizontal();
        ball.reflectVertical();
        ball.move();
        System.out.println(ball);
    }
}
