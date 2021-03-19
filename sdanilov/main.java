package sdanilov;

import sdanilov.OOPFirst.*;
import sdanilov.OOPSecond.*;

public class main{
    public static void main(String[] args){
        // OOP First Homework Check
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        Employee e = new Employee(5, "Jack", "Nilson", 90);
        Author[] aList = new Author[2];
        aList[0] = new Author("HHH", "sdf@wer.ru", 'w');
        aList[1] = new Author("HHH", "sdf@wer.ru", 'w');
        Book b = new Book("C++", aList, 500, 8);
        MyTriangle tr = new MyTriangle(0,0,0,9,1,0);
        MyPoint a1 = new MyPoint(0, 0);
        MyPoint a2 = new MyPoint(8,9);
        MyPoint a3 = new MyPoint(0,9); 
        MyTriangle t2 = new MyTriangle(a1, a2, a3);
        System.out.print(b);
        // *****************************

        MyComplex mc = new MyComplex(9,-8);
        System.out.println(mc.divide(mc).conjugate().add(mc).argument());
    }
}

