
package Constructor;

public class OverloadingConstructor {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        
        Teacher teacher2 = new Teacher("Hridoy","Male");
        teacher2.disp();
        
        Teacher teacher3 = new Teacher("Hridoy","Male",22);
        teacher3.disp();
    }
}
