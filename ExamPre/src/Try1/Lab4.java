/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Try1;
 import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
/**
 *
 * @author My AsUs
 */
public class Lab4 {
   



    public static void main(String[] args){
    Scanner input=new Scanner(System.in);
  ArrayList<Integer> a = new ArrayList<>();
  while(true)
 {
     int n;
     n=input.nextInt();
     if(n==0)
         break;
     else
         a.add(n);
     
 }
  Collections.sort(a);
  int c=0;
  for(int i=0;i<a.size()-1;i++)
  {
      if(a.get(i)!=0)
      {
      for(int j=i+1;j<a.size();j++)
      {
          if(a.get(i)==a.get(j))
          {
              a.set(j,0);
              c++;
          }
      }
      System.out.println(a.get(i)+" occurs "+(c+1)+" times.");
      c=0;
      }
  }
    }
}

