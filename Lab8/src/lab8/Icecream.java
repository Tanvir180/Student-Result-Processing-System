
package lab8;

public class Icecream {
       String icecreamType;
       String icecreamCompany;
       double icecreamPrice;
       public Icecream()
       {
          this.icecreamType = "Chocbar";
          this.icecreamCompany = "Egloo";
          this.icecreamPrice = 50.00;
           
       }
       public Icecream(String icecreamType,String icecreamCompany,double icecreamPrice)
       {
          this.icecreamType = icecreamType;  
          this.icecreamCompany = icecreamCompany;
          this.icecreamPrice = icecreamPrice;
       }
       public String toString()
       {
           return "Iceceam Type is "+icecreamType+ " Icecream Company is "+icecreamCompany+"Icecream Price is "+icecreamPrice;
       }
       
       
       
       
       
       
    /*   void setIcecreamType(String icecreamType)
       {
           this.icecreamType = icecreamType;
       }
       
       void setIcecreamCompany(String icecreamCompany)
       {
           this.icecreamCompany = icecreamCompany;
       }
       
       void setIcecreamPice(String icecreamType)
       {
           this.icecreamPrice = icecreamPrice;
       }
       String getIcecreamType()
       {
           return icecreamType;
       }
       String getIcecreamCompany()
       {
           return icecreamCompany;
       }
       
       double getIcecreamPrice()
       {
           return icecreamPrice;
       }
      */ 
}
