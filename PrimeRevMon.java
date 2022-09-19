
public class PrimeRevMon{
    public static void main(String[]args){

        int no = 11;
        int temp = 0;
        for(int i=2;i<=7;i++){
            if(i%no==0){
            temp = temp + 1;
            }
        }
        if(temp>0){
            System.out.println("This is Not prime number");
        }
    
    else {
        System.out.println("This is prime");
    }
}
}



