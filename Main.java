import java.util.Scanner;
public class Main{
    public  static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        //input 5 numbers
        System.out.println("Enter 5 numbers:");
        for (int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        //sorting using bubble sort
        for (int i=0;i<4;i++){
            for (int j=0;j<4-i;j++){
                if (arr[j]>arr[j + 1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        
        }
        //Displaysorted array
        System.out.println("Sorted array:");
        for (int i=0;i<5;i++){
            System.out.println(arr[i]+"");
        }
        //find second lowest and second highest
        int secondLowest=arr[1];
        int secondHighest=arr[3];
        System.out.println ();
        System.out.println("Second Lowest:"+secondLowest);
        System.out.println("Second Highest :"+secondHighest);
    sc.close();
    }
    
}
