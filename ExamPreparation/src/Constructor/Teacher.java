
package Constructor;

public class Teacher {
    String name,gender;
    int age;
    
    Teacher(){      //Default Constructor
        System.out.println("No Value");
    }
    
    Teacher(String n,String g){
        name = n;
        gender = g;
        
    }
    Teacher(String n,String g,int a){
        name = n;
        gender = g;
        age = a;
    }
    
    void disp(){
        System.out.println("Name : "+name);
        System.out.println("Gender : "+gender);
        System.out.println("Age : "+age);
    }
}
