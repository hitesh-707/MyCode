public class PalidromNum {
    public static void main(String[] args) {
        int no = 500;
        int temp = no;
        int rem;
        int rev = 0;
        while(temp!=0){
            rem = temp%10;
            rev = rev * 10 + rem;
            temp = temp/10;

        }
    if(no==rev){
        System.out.println(no+" "+"This is palidrom number");
    }
    else {
        System.out.println(no+" "+"This is not palidrom number");
    }
    }
}

