
package ClassObj;

public class Teacher {
    String name,gender;
    int age;

    void setInfo(String n,String g,int a){
        name = n;
        gender = g;
        age = a;
}
    
    void displayInfo(){
        System.out.println("Name : "+name);
        System.out.println("Gender : "+gender);
        System.out.println("Age : "+age);
        System.out.println("\n\n");
    }
} 
