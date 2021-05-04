package be.bxl.formation;

public class TableMulti {

    public static void main(String[] args)
    {
        int incr=0, incr2 =2;

        while(incr2<=9) {
            incr =1;
            while(incr<=10) {
                System.out.println(incr +" x " + incr2 + "=" + (incr *incr2) );
                incr++;
                        }
                incr2++;
        }
    }
}
