class Calculator{
    public int add(int x, int y){
        return x+y;
    }
    public int sub(int x, int y){
        return x-y;
    }
    public double multiply(double x, double y){
        return x*y;
    }
    public double divide(double x, double y){
        if(y != 0)
            return x/y;
        else
            return 0;
            
    }

    public static void main(String[] args){
        int x = 3;
        int y = 4;
        Calculator calc = new Calculator();
        System.out.println(x + " + " + y + " = " + calc.add(x, y));
        System.out.println(x + " - " + y + " = " + calc.sub(x, y));
        System.out.println(x + " * " + y + " = " + calc.multiply(x, y));
        System.out.println(x + " / " + y + "  = " + calc.divide(x, y));
    }
}