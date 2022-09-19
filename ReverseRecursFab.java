public class ReverseRecursFab {
    static int a=0 , b=1 , c;
    public static void main(String[]args){
        ReverseRecursFab sc = new ReverseRecursFab();
        sc.calRecRev(10);

    }

    void calRecRev(int i){
        if(i>=1){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
            calRecRev(i-1);
                
        }
        
    }


    }
    
