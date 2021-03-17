package sdanilov.OOPFirst;

import javax.management.RuntimeErrorException;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3){
        this(new MyPoint(x1,y1), new MyPoint(x2,y2), new MyPoint(x3,y3));
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3){
        double[] distances = new double[]{v1.distance(v2), v3.distance(v2), v1.distance(v3)};
        for (int i = 0; i < 3; i++){
            if (distances[i] == 0){
                throw new RuntimeErrorException(new Error(), "Wrong triangle: One side has length 0");
            }
        }
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public double getPerimeter(){
        return v1.distance(v2)+v2.distance(v3)+v3.distance(v1);
    }

    public String getType(){
        double[] distances = new double[]{v1.distance(v2), v3.distance(v2), v1.distance(v3)};
        if (distances[0] == distances[1] && distances[1] == distances[2]){
            return "Equilateral";
        }
        if (distances[0] != distances[1] && distances[1] != distances[2] && distances[2] != distances[0]){
            return "Scalene";
        }
        return "Isosceles";

    }

    @Override
    public String toString() {
        return String.format("MyTriangle[v1=%s,v2=%s,v3=%s]", v1, v2, v3);
    }

}
