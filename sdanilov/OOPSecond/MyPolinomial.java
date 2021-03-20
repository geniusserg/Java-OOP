package sdanilov.OOPSecond;

/**
 *  Class: MyPolinomial
 * 
 * Author: Danilov Sergey
 * 
 * Date: 3/19/2021
 */

import javax.management.RuntimeErrorException;

public class MyPolinomial {
    private double coeffs[];

    public MyPolinomial(double coeffs[]){
        this.coeffs = coeffs;
    }

    /**
     * return the degree of polynom
     */
    public int getDegree(){
        return coeffs.length;
    }

    /**
     * return coeffs
     */
    public double[] getCoeffs(){
        return coeffs;
    }


    /**
     * insert x value in the polynom and return result
     * @param x
     * @return
     */
    public double evaluate(double x){
        double result = 0;
        for (int i = 0 ; i < this.coeffs.length; i++){
            result += this.coeffs[i]+Math.pow(x, i);
        }
        return result;
    }

    /**
     * Operator plus for polynom
     *  z1 = ax+b
     *  z2 = cx+d
     *  z1+z2 = (a+c)x+(b+d)
     * @param right
     * @return
     */
    public MyPolinomial add(MyPolinomial right){
        if (right.getDegree() != this.getDegree()){
            throw new RuntimeErrorException(new Error(), "Degrees are not equal. This: "+this.getDegree()+" Right: "+right.getDegree());
        }
        double[] coeffSum = new double[this.coeffs.length];
        for (int i = 0; i < coeffs.length; i++){
            coeffSum[i] = coeffs[i]+right.getCoeffs()[i];
        }
        return new MyPolinomial(coeffSum);

    }

    /**
     * Operator multiply for polynom
     * z1 = ax+b
     * z2 = cx+d
     * z1*z2 = (a*c)x2+(c*b+a*d)x+b*d
     * @param right
     * @return
     */
    public MyPolinomial multiply(MyPolinomial right){
        double[] coeffRight = right.getCoeffs();
        double[] coeffSum = new double[this.coeffs.length+coeffRight.length-1];
        for (int i = 0; i < coeffSum.length; i++){
            coeffSum[i] = 0;
        }
        for (int i = 0; i < this.coeffs.length; i++){
            for (int j = 0; j < coeffRight.length; j++){
                coeffSum[i+j] += this.coeffs[i]*coeffRight[j];
            }
        }
        return new MyPolinomial(coeffSum);
    }

    /**
     * return string in format ...+cx^2+bx+a
     */
    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < coeffs.length; i++){
            result += coeffs[i];
            switch(coeffs.length-i){
                case 2 : {result += "x+"; break;}
                case 1 : {break;}
                default: result += "x^" + (coeffs.length-i-1) + "+";
            }
        }
        return result;
    }
    
}
