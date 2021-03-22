package sdanilov.OOPFirst;

/**
 * Class: MyPoint
 * 
 * Author: Danilov Sergey
 * 
 * Date: 3/22/2021
 */

public class MyPoint {

    private float x = 0;
    private float y = 0;

    public MyPoint(){}

    public MyPoint(float x, float y){
        this.x = x;
        this.y = y;
    }
    
    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float[] getXY(){
        return new float[]{x,y};
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }
      
    public double distance(float x, float y){
        return Math.sqrt(Math.pow(this.x-x, 2)+Math.pow(this.y-y, 2));
    }

    public double distance(){
        return distance(0, 0);
    }

    public double distance(MyPoint point){
        return distance(point.getX(), point.getY());
    }

    @Override
    public String toString() {
        return String.format("(%f,%f)", x, y);
    }

}
