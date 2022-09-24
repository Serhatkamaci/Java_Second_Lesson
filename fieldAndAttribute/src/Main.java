public class Main {
    public static void main(String[] args)
    {
        Product product=new Product();
        product.name="Oppo A54";
        product.price=4803.54;
        product.description="Oppo Mobile Phone";
        product.stocAmount=100;
        product.id=105;
        System.out.println("Name: "+product.name);
        System.out.println("Price: "+product.price);
        System.out.println("Description: "+product.description);
        System.out.println("Stock Amount: "+product.stocAmount);
        System.out.println("Id: "+product.id);

        ProductManager productManager=new ProductManager();
        productManager.add(product);
    }
}
