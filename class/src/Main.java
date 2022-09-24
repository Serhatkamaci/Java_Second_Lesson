public class Main {
    public static void main(String[] args)
    {
        // Classlarda temel kurallardan biri gruplama islemi yapmaktır.

        CustomerManager customerManager=new CustomerManager();
        // customermanager adli bir nesne olusturmus oldum.
        // Class referans tiplidir.
        // Yani bellekte "stack ve heap" alanini kullanir.
        // CustomerManager customerManager; boyle kullansaydim. Bu nesne baslatilmamis olabilir diye hata vericekti.
        // Islemler "heap" alaninda gerceklesiyor.

        CustomerManager customerManager2=new CustomerManager();
        customerManager=customerManager2; // Bu islem ile ilk olusturmus oldugum "customerManager" soluklasdi. Eger kullanmaz isem cop toplayicisina gidicek ve silinecek.
        // Artik ilk nesnemiz ikinci nesnenin referansini tutar.

        customerManager.add();
        customerManager.remove();
        customerManager.update();





    }
}
