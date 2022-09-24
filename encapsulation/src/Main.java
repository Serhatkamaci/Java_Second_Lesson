public class Main {
    public static void main(String[] args)
    {
        // Ben public void add2(int id,String name vb.) seklinde olusturabilirim ekleme metodumu.
        // Fakat eger en ufak bir degisiklik ekleme veya cikarma ozellik(field veya attribute) olursa butun yerlerde bunu olusturmus oldugum tum product nesnesi icin degistirmem gerekir.
        // Bu islemden kurtulmak amaciyla kapsulleme(encapsulation) islemi isimize cok yarar.

        Product product=new Product();
        product.setId(100);
        product.setName("Xiaomi Redmi Note 11");
        product.setDescription("Xiaomi Mobile Phone");
        product.setPrice(5509.48);
        product.setStockAmount(150);
        product.getCode();

        System.out.println("Id: "+product.getId());
        System.out.println("Name: "+product.getName());
        System.out.println("Description: "+product.getDescription());
        System.out.println("Price: "+product.getPrice());
        System.out.println("Stock Amount: "+product.getStockAmount());
        System.out.println("Code of this product: "+product.getCode());

        ProductManager productManager=new ProductManager();
        System.out.println();
        productManager.add(product);
    }
}
