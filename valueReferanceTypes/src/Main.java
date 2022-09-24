public class Main {
    public static void main(String[] args) {
        int number1 = 10, number2 = 20;
        number2 = number1;
        number1 = 30;
        System.out.println(number2);
        // Neden sayi2=10 oldu ?
        // Cunku "ilkel tipler" deger tiplidir. Yani "new" yapisi ile olusmayan nesneler bellegin sadece "stack" alanini kullanir.
        // Bu yuzden "sayi1=30" olmasi sayi2'yi degistirmeyecektir.


        int[] numbers1=new int[]{1,2,3};
        int[] numbers2=new int[]{4,5,6};

        numbers2=numbers1;
        numbers1[0]=10;
        System.out.println(numbers2[0]);
        // Diziler referans tipli nesnelerdir.
        // Bu yuzden number2 number1'ın referansini tuttugu icin number1'da yaptigim degisklik ayni referansi tuttugu icin numbers2'da da degisecektir.






    }
}
