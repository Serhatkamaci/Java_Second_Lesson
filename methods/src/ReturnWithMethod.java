public class ReturnWithMethod {
    // Return deyimi ile geriye deger dondurmus olurum.
    // Void deyimi gecen metodlari bir degiskene atayamazssin.
    // Metodlara verdigim degerlere parametre denir.
    public static void main(String[] args) {
        //System.out.println("Toplam sonucu: "+topla(2,5));

        /**
         Simdi "variable arguments" kullanalim. İstedigim kadar
         sayi girerim zaten arka planda bir array olusturur.
         **/
        System.out.println("Toplam sonucu: " +topla2(2, 3, 5, 4, 8, 10));


    }

    public static int topla(int x, int y) {
        return x + y;
    }

    public static int topla2(int... numbers) {
        int total=0;// Javda bir degiskeni baslatman gerekir. Yani bir deger atamasi.
        for (int i : numbers)
        {
            total += i;
        }
        return total;
    }
}
