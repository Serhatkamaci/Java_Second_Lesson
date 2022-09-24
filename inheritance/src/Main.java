public class Main {
    public static void main(String[] args)
    {
        // Bir class sadece bir class'ı miras(inheritance) edebilir.
        // Kalitim ile ortak ozellikleri veya metodlari alabilirim.

        Employee employee=new Employee();
        employee.id=100;
        employee.firstName="Serhat";
        employee.lastName="Kamaci";
        employee.age=21;
        employee.salary=7500;
        employee.email="serhatkmc16@gmail.com";

        // Ben employee class'inda salary disindaki ozellikleri tanimlamadigim halde bu ozelliklere miras(inheritance) islemi ile ulasmis oldum.
        System.out.println("Id: "+employee.id);
        System.out.println("FirstName: "+employee.firstName+"\n"+"LastName: "+employee.lastName);
        System.out.println("Age: "+employee.age);
        System.out.println("Salary: "+employee.salary);
        System.out.println("Email: "+employee.email);


        EmployeeManager employeeManager=new EmployeeManager();
        // Ben emplyoeeManager class ile customerMnagaer class'indan miras almistim, metodlari.
        // Bakalim ulasabiliyor muyuz?
        employeeManager.add();
        employeeManager.list();
        employeeManager.update();
        // Sonuc oalrak ulasmis olduk :).


    }
}
