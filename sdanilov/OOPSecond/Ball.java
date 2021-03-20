package sdanilov.OOPSecond;

/**
 *  Class: Ball
 * 
 * Author: Danilov Sergey
 * 
 * Date: 3/19/2021
 */

public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    public Ball(float x, float y, int radius, int speed, int ballDirection){
        this.x = x;
        this.y = y;
        this.radius = radius;
        double direction = Math.toRadians(ballDirection);
        this.xDelta = (float)(speed*Math.cos(direction));
        this.yDelta = -(float)(speed*Math.sin(direction));
    }
    /**
     * Move ball on dX and dY
     */
    public void move(){
        this.x += xDelta;
        this.y += yDelta;
    }

    /**
     * Collide with horizontal floor
     */
    public void reflectHorizontal(){
        this.xDelta = -this.xDelta;
    }

    /**
     * Collide with vertical floor
     */
    public void reflectVertical(){
        this.yDelta = -this.yDelta;
    }

    /**
     * "Ball[(3.0,4.0), speed=(0.5,0.5)]"
     */
    @Override
    public String toString() {
        return String.format("Ball[(%f, %f), speed=(%f,%f)]", x, y, xDelta, yDelta);
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }

    public float getxDelta() {
        return xDelta;
    }

    public float getyDelta() {
        return yDelta;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setX(float x) {
        this.x = x;
    }
    
    public void setY(float y) {
        this.y = y;
    }

    public void setxDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public void setyDelta(float yDelta) {
        this.yDelta = yDelta;
    }


}
