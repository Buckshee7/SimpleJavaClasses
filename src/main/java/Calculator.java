public class Calculator {

    private int a;
    private int b;
    private double c;
    private double d;

    public Calculator(int a, int b){
        this.a = a;
        this.b = b;
    }

    public Calculator(double c, double d){
        this.c = c;
        this.d = d;
    }

    public int addFunction (){
        return this.a + this.b;
    }

    public int subtractFunction (){
        return this.a - this.b;
    }

    public int multiplyFunction (){
        return this.a * this.b;
    }

    public double divideFunction (){
        return this.c / this.d;
    }
}
