          
public class RecursionFab{
    static int a=0 , b=1, c;
    
    public static void main(String[] args) {
        RecursionFab ob = new RecursionFab();
        ob.printFab(10);


        
    }
    void printFab(int i){
        if(i>=1){
        c = a+b;
        System.out.println(c);
        a=b;
        b=c;
        printFab(i-1);
    }
}
}