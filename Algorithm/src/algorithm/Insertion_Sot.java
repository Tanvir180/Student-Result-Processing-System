
package algorithm;

public class Insertion_Sot {
   
    public static void insertionSort(int array[]) {  
        int n = array.length;  
        for (int i = 1; i < n; i++) {  
            int j = i;  
            while ( (j > 0) && ( array [j-1] > array[j] ) ) {
                int temp = array[j];
                
                array [j] = array [j-1];  
                array[j-1]= temp;
                j--;  
            }  
              
        }
       
    }  
       
    public static void main(String a[]){    
        int[] array = {9,14,3,2,43,11,58,22};  
        int n = array.length;  
        System.out.println("Before Insertion Sort");    
        for(int i = 0; i < n; i++){    
            System.out.print(array[i]+" ");    
        }    
        System.out.println();    
            
        insertionSort(array);//sorting array using insertion sort    
           
        System.out.println("After Insertion Sort");    
        for(int i = 0; i < n; i++){    
            System.out.print(array[i]+" ");    
        }    
          System.out.println(); 
    }    
}     

