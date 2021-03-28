
package AbstractClass;

public class Test {
    public static void main(String[] args) {
        MobileUser ms;  //abs class er reference toiri kora jay obj kors jay na
        ms=new Rahim();
        ms.SendMessage();
        ms=new Karim();
        ms.SendMessage();
        ms.call();
        
        
        
        Rahim e=new Rahim(); //normal class er obj create kora jay
        e.SendMessage();
    }
}
