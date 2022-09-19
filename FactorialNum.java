public class FactorialNum{
    static int fact = 1;
    public static void main(String[] args) {
        int no = 5;
        int rev;
        FactorialNum sc = new FactorialNum();
        rev=sc.calFact(no);
        System.out.println(rev);


    }
    int  calFact(int no){
        if(no>=1){
            fact = fact * no;
        calFact(no-1);

    }
    return fact;
}


}