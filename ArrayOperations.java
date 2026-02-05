import java.util.Scanner;
public class ArrayOperations{
    public static void main(String[]args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("===Array Operations===\n");
        
        //declare array of 5 integers
        int[] numbers=new int[5];
        
        //get numbers from user
        System.out.println("enter 5 numbers:");
        for (int i =0; i<numbers.length; i++){
            System.out.print("number"+(i+1)+":");
            numbers[i]=Scanner.nextInt();
        }
            //display all numbers
            System.out.println("\n---your numbers---");
            System.out.print("[");
        
            for (int num:numbers){
                System.out.print(num+"");
            }
            System.out.print("]");
            
            //calculate sum
            
            int sum=0;
            for(int num: numbers){
                sum+=num;
                
            }
            //calculate average
            double average=(double)sum/numbers.length;
            
            //find maximum
            int max=numbers[0];
            for (int num:numbers){
                if (num>max){
                    max=num;
                }
            }
            
            //find minimum
            int min=numbers[0];
            for(int num:numbers){
                if (num<min){
                    min=num;
                }
            }
        //display results
    System.out.println("Statistics");
    System.out.println("sum:"+ sum);
    System.out.println("avarage:%.2f%n", average);
    System.out.println("maximum:"+ max);        
    System.out.println("minimum:" + min);
    

    }
}

        
        
        
    