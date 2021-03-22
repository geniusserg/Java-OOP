package sdanilov.OOPFirst;

/**
 * Class: MyRectangle
 * 
 * Author: Danilov Sergey
 * 
 * Date: 3/22/2021
 */

public class Rectangle {
    private float length = 1.0f;
    private float width = 1.0f;
    public Rectangle(){}
    public Rectangle(float length, float width){
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }

    public void setLength(float length) {
        if (length > 0){
            this.length = length;
        }
    }

    public void setWidth(float width) {
        if (width > 0){
            this.width = width;
        }
    }

    @Override
    public String toString() {
        return String.format("Rectangle[length=%f,width=%f]", length, width);
    }

    public float getArea(){
        return length*width;
    }

    public float getPerimeter(){
        return 2*length+2*width;
    }


}
