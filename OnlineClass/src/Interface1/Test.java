
package Interface1;

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        Cat c =new Cat();
        c.eat();
        //interface er o obj create kora jai na tai reference create korte hoy
        Animal an;
        an = new Dog();
        an.eat();
    }
}
