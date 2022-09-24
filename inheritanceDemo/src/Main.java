public class Main {
    public static void main(String[] args)
    {
        // Insanlarin hayati surekli degiskendir. Bizim ise bu degiskenlige direnmeyen programlar yazmamaiz gerekir.
        // Isde tam bu noktada devreye Surdurebilir yazilimlar girer.
        // Bir class sadece bir class'i miras alabilir.

        BaseKrediManager[] baseKrediManager={new TarimKrediManager(),new OgretmenKrediManager()};
        // Yukaridaki new islemlerini soyle dusunebiliriz.
        // "BaseKrediManager baseKrediManager=new TarimKrediManager" yani miras aldigim yapi ile tarimKrediManager nesnesi olusturmus oldum.

        // Hadi bu diziyi bir dongu icersine alalim.

        for(BaseKrediManager i:baseKrediManager)
        {
            i.calculate(i); // Bu islem ile ayri ayri olarak birincisi tarimKrediManager, ikincisi ise ogretmenKrediManager icin ayri ayri hesplandi sonuclari cikacak.
        }

        // Ben istedigim kadar krediManager olusturabilirim ve ayri ayri yazabilirim.
    }
}
