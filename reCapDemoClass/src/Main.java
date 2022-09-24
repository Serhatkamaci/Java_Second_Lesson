public class Main {
    public static void main(String[] args)
    {
        Calculator calculator=new Calculator();
        System.out.println("Toplama sonucu: "+calculator.add(2,5));
        System.out.println("Cikarma sonucu: "+calculator.substract(4,10));
        System.out.println("Carpma sonucu: "+calculator.mult(10,8));
        calculator.div(2,0);
        calculator.div(10,5);
    }
}
