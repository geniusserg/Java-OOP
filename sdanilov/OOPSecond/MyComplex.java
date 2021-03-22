package sdanilov.OOPSecond;

/**
 * Class: MyComplex
 * 
 * Author: Danilov Sergey
 * 
 * Date: 3/22/2021
 */

public class MyComplex {
    private double real = 0.0;
    private double imag = 0.0;
    
    public MyComplex(){}

    /**
     * Create complex real+image*i
     * @param real
     * @param imag
     */
    public MyComplex(double real, double imag){
        this.real = real;
        this.imag = imag;
    }

    public double getImag() {
        return imag;
    }

    public double getReal() {
        return real;
    }
    
    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setValue(double real, double imag){
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        return String.format("(%f%c%fi)", real, (imag>0)?'+':'-', Math.abs(imag));
    }

    /**
     * Is number real?
     * @return
     */
    public boolean isReal(){
        return (float)this.imag == 0;
    }

    /**
     * Is number imaginary?
     * @return
     */
    public boolean isImaginary(){
        return (float)this.imag != 0;
    }

    /**
     * Compare with complex number
     * @param real
     * @param imag
     * @return
     */
    public boolean equals(double real, double imag){
        return ((this.real == real) && (this.imag == imag));
    }

    /**
     * Compare with complex number
     * @param other - number to compare
     * @return
     */
    public boolean equals(MyComplex other){
        return ((other.real == real) && (other.imag == imag));
    }

    /**
     * Return module of complex number
     * @return
     */
    public double magnitude(){
        return Math.sqrt(Math.pow(this.real, 2) + Math.pow(this.imag, 2));
    }

    /**
     * Return argument in radian
     * @return
     */
    public double argument(){
        return Math.atan2(this.real, this.imag);
    }

    /**
     * + operator
     * @param other
     * @return this object
     */
    public MyComplex add(MyComplex other){
        this.real += other.real;
        this.imag += other.imag;
        return this;
    }

    /**
     * + operator
     * @param other
     * @return new object
     */
    public MyComplex addNew(MyComplex other){
        MyComplex result = new MyComplex();
        result.setReal(this.real + other.real);
        result.setImag(this.imag + other.imag);
        return result;
    }

    /** - operator
    * @param other
    * @return this object
    */
    public MyComplex substract(MyComplex other){
        this.real -= other.real;
        this.imag -= other.imag;
        return this;
    }

    /** - operator
    * @param other
    * @return new object
    */
    public MyComplex substractNew(MyComplex other){
        MyComplex result = new MyComplex();
        result.setReal(this.real - other.real);
        result.setImag(this.imag - other.imag);
        return result;
    }

    /** * operator
    * @param other
    * @return this object
    */
    public MyComplex multiply(MyComplex other){
        double Rcoef = this.real*other.real - this.imag * other.imag; 
        double Icoef = this.real * other.imag + this.imag * other.real; 
        this.real = Rcoef;
        this.imag = Icoef;
        return this;
    }

    /** / operator
    * @param other
    * @return this object
    */
    public MyComplex divide(MyComplex other){
        if ((float)other.magnitude() == 0f){
            double Rcoef = this.real*other.real - this.imag*other.imag;
            this.imag = (this.imag * other.real - this.real * other.imag) / other.magnitude();
            this.real = Rcoef / other.magnitude(); 
        }
        return this;
    }

    /** conjugate number (r,i), return new complex number with (r, -i) params
    * @param other
    * @return this object
    */
    public MyComplex conjugate(){
        return new MyComplex(this.real, -this.imag);
    }

}
