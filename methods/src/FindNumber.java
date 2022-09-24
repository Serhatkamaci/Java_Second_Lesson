public class FindNumber {
    // Void deyimi geriye deger dondurmez.
    public static void main(String[] args)
    {
        findNumber();
    }
    public static void findNumber()
    {
        int [] numbers={10,20,30,40,50,60};
        int number=80,x=0;
        for(int i:numbers)
        {
            if(i==number)
            {
                x=1;
                break;
            }
            else
            {
                x=0;
            }
        }
        if(x==1)
        {
            sendMesagge("Sayi bulundu: "+number);
        }

        else
        {
            sendMesagge("Sayi bulunamadi: "+number);
        }
    }
    public static void sendMesagge(String message)
    {
        System.out.println(message);
    }
}
