package week1;

import java.util.Random;
import java.util.Scanner;

public class LinearSeach {
    private int[] randomArray;

    public LinearSeach() {
    }
  
    public void run(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements:");
        int size = sc.nextInt();
        randomArray = new int[size];
        generateElement(randomArray);
        System.out.print("Enter search value:");
        int searchValue = sc.nextInt();
        search(randomArray, searchValue);
    }
    
    void generateElement(int[] r){
        Random random = new Random();
        for(int i=0; i < r.length -1; i++){
            r[i]= random.nextInt(10);
        }
    }
    
    void display(){
        System.out.print("Generated array: \n");
        for(int i:randomArray){
            System.out.print(i + " ");
        }
    }
    
    void search(int[] r, int s){
        display();
        int f=0;
        for(int i=0; i < r.length-1; i++){
         
         if(r[i]==s){
             System.out.println("\nFound " +s +"index:" +i);
             f=f+1;
             break;
         }
         
        }
        if(f==0){
            System.out.println("\nNot Found");
        }
       
    }
}