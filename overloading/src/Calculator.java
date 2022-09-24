public class Calculator {
    public Calculator()
    {
        System.out.println("Yapici blok olusturuldu.");
    }
    public void add(int number1, int number2)
    {
        System.out.println("2 parametreli toplam sonucu: "+(number1+number2));
    }

    public void add(int number1, int number2, int number3)
    {
        System.out.println("3 parametreli toplam sonucu: "+(number1+number2+number2));
    }

    // Dikkat eger sayilari toplama islemlerinde parantez kullanmaz isem strng olarak yan yana yazacak.
}
