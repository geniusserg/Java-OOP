package sdanilov.OOPSecond;

/**
 *  Class: Ball
 * 
 * Author: Danilov Sergey
 * 
 * Date: 3/22/2021
 */

public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;
    private Container container;
    private int speed; /** needed for recalculating of speed vector */
    private int degree; /** needed for recalculating of speed vector */

    /**
     * Constructor of Ball class
     * 
     * I decided to delete params speed and ballDirection from constructor
     * because it can be defined only before action move (logically), not in the initialization
     * So, by my design, we will use ball so: ball.setSpeedVector(7, 90).move()
     * where 7 is speed and degree of ball direction is 90
     * 
     */
    public Ball(float x, float y, int radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.speed = 0;
        this.degree = 0;
    }

    /**
     * Move ball on dX and dY, consuming clushes
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

    public void setSpeed(int speed){
        setSpeedVector(speed, this.degree);
    }

    public void setDirection(int degree){
        setSpeedVector(this.speed, degree);
    }

    /**
     * Set speed and direction of movement. Calculate dX and dY
     * @param speed
     * @param ballDirection
     * @return
     */
    private Ball setSpeedVector(int speed, int ballDirection){
        double direction = Math.toRadians(ballDirection);
        this.xDelta = (float)(speed*Math.cos(direction));
        this.yDelta = -(float)(speed*Math.sin(direction));
        return this;
    }

    /**
     * Try to put ball in the container (I decided to add it to connect Ball with Container)
     * If ball is already in contanier, just update container variable
     * Else if ball can be put in container, change coordinates of ball 
     * Else we can not put ball in container
     * @param container
     * @return
     */
    public boolean putInContainer(Container container){
        if (container.collides(this)){
            this.container = container;
        }
        else if (container.collides(new Ball(container.getX()+radius,
                                             container.getY()+radius, 
                                             radius))){
            this.x = container.getX()+radius;
            this.y = container.getY()+radius;
            this.container = container;
        }
        else{
            return false;
        }
        return true;
    }

}
