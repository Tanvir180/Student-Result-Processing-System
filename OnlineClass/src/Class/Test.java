
package Class;


public class Test {
    String name,gender;
    String phone;
    //CONSTRUCTOR
    Test(String n,String g,String p)
    {
       name = n;
       gender = g;
       phone = p;
       
    }
    void display()
    {
        System.out.println("Name :"+name);
        System.out.println("Gender :"+gender);
        System.out.println("Phone :"+phone);
    }
}

