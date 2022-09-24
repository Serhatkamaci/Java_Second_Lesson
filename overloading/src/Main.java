public class Main {
    public static void main(String[] args)
    {
        // Ben bir metodu ayni isim ile olusturdugum an o metodu overloading etmis olabilirim.
        // Fakat bu overloading ettigim yeni metod ilk metotdan farkli olmasi gerekir.

        Calculator calculator=new Calculator();
        calculator.add(2,5);
        calculator.add(4,5,6);
    }
}
