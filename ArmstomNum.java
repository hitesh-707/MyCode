public class ArmstomNum {
    public static void main(String[] args) {
        /* Pehla apde length nikadisu aama
        153/10 = 15 aavse t1 ni values,
        t1 ni value 0 nathi atle ,
        have length = 0 che atle pehla while loop ma 0+1=1 thase,.
        have fari thi t1=15/10 atle t1 ni value 1 thase 
        have loop padse 1+1=2 thase  have,
        t1 = 1 che haji pan zero ne qual nathi atle 1/10 thase atle loop farse pehla leng 2 avi, 
        have leng 2+1=3 thase ne same t1 pan have zero thase atle loop nai fare atle
        length ni value 3 aavse ne length find thase*/


        int no = 153;
        int t1=no;
        int leng=0;
        while (t1!=0) {
            t1=t1/10;
            leng = leng + 1;
            
        }
    /* have reverse nu logic lagadisu
    153 ma reverse 351 thase atle
    3=3*3*3;
    5=5*5*5;
    1=1*1*1;
    3 var multiply atle kariyu kem ke length 3 che 
    ne have aa badha ne chelle sarvado karavisu*/

    int t2=no;
    int rem;
    int arm = 0;
    while (t2!=0){
        int multi=1;
        rem = t2%10;
    for(int i=1;i<=leng;i++){
       
        multi = multi * rem;
    }
        /* t2 ni value 153 che ne rem nikadva mate 153/10 = 15 rem aavse 
        have rem 3 aavse je multi jode multiply thase so 1*3 = 3 (multi = 1)
        have length 3 madi che atle while loop total 3 var farse atle pehla 3 aavse multi pachi 9 aave
        pachi 27 aavse atle 3=3*3*3 = 27 nu puru kariyu have ek bijo veriable laisu arm vado
         */
        //have apde arm vado veriable laisu je ni value 27 thase 
        /* fari thi t2 = 15 / 10 karisu kem 153/10=15 ne rem 3 aavse ne while loop fervisu jiya sudhi t2==0 na avse 
        15 = 15 rem 1 aavse rem 5 aavse atle multi ma 5*1=5 ne leng 3 che atle 3 vaar check karse 
        5*5*5 =125 aavse 125+27=152 thase
         * 
         */
        arm = arm + multi ;
        t2=t2/10;
    }
    if(arm==no){
        System.out.println(no+" "+"this is number");
    }
    else {
        System.out.println(no+" "+"this is not number");
    }
    }
    }


