public class Calculator {
    public int add(int number1, int number2){
        return number1+number2;
    }
    public int substract(int number1, int number2)
    {
        return number1-number2;
    }
    public int mult(int number1, int number2)
    {
        return number1*number2;
    }
    public void div(int number1, int number2)
    {
         double result=0;

        if (number2!= 0)
        {
            result=number1/number2;
            System.out.println("Bolme sonucu: "+result);
        }
        else
        {
            System.out.println("Error with by zerodivision.");
        }
    }

}
