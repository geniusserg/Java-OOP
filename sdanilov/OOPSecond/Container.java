package sdanilov.OOPSecond;

public class Container {
    private float x1;
    private float x2;
    private float y1;
    private float y2;

    public Container(float x, float y, float width, float height){
        this.x1 = x;
        this.y1 = y;
        this.x2 = x + width;
        this.y2 = y + height;
    }

    public float getX(){
        return x1;
    }

    public float getY(){
        return y1;
    }

    public float getHeight(){
        return y2-y1;
    }

    public float getWeight(){
        return x2-x1;
    }

    /**
     * Is the ball in the container?
     * @param ball
     * @return
     */
    public boolean collides(Ball ball){
        return ((ball.getX()+(float)ball.getRadius() <= x2)
                 && (ball.getX()-(float)ball.getRadius() >= x1)
                 && (ball.getY()+(float)ball.getRadius() <= y2)
                 && (ball.getY()-(float)ball.getRadius() >= y1));
    }

    @Override
    public String toString() {
        return String.format("Container[(%f,%f) , (%f,%f)]", x1, y1, x2, y2);
    }

    /**
     * Put the ball in this conatiner
     * See definition putInContainer in Ball class
     */
    public boolean addBall(Ball ball){
        return ball.putInContainer(this);
    }


    
}
