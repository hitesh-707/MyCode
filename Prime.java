//This Program is for 2 to 6 values are dividing or not for check prime number
/*import java.util.Scanner;
public class Prime{
    public static void main(String[]agrs) {
        System.out.println("Enter Number Here");
        Scanner sc = new Scanner(System.in);

        int no=sc.nextInt();
        int temp = 0;

        for(int i=2;i<=no-1;i++){
            if(no%i==0){
                temp = temp +1;

            }
        }
      if(temp>0){
        System.out.println("This Is Not A Prime Number");
      }  
    else{
        System.out.println("This is prime number");
    }
    }
*/
//or
//This Program is to check it is prime number or not
import java.util.Scanner;
public class Prime{
    public static void main(String []args){
        System.out.println("Enter Number Here");
        Scanner ob = new Scanner(System.in);
        int no = ob.nextInt();
        if(no/2!=0){
            System.out.println("This is  prime number");
        }
   else{
    System.out.println("This is not prime number");
   }
    }
}

                                                                                                                                                                                                                                        

















