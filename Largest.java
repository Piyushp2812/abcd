import java.util.*;

public class Largest{

   public static int getLargest(int numbers[]){
    int largest = Integer.MIN_VALUE;
    for(int i=0;i<numbers.length;i++){
        if(numbers[i]>largest){
            largest = numbers[i];
        }
 
    }
     return largest;
   }

   public static void main(String args[]){
       int numbers[] = {66,85,75,55,99,88,57};

       System.out.println("Smallest number is :"+ getLargest(numbers));
  }
}