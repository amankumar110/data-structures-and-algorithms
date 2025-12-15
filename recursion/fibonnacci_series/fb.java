public class fb {

    public static void main(String[] args) {

        System.out.println("Num: "+findNthFibNumber(5));
    }

    public static int findNthFibNumber(int n ) {

        /*
        fibo series: 0 1 1 2 3 5 8 13 21 34 55 89 ...
        here nth number = n-1)th and n-2)th number except 1th and 2th number they are defiend as 0 and 1.

        so what we can do is keep finding prev nums as long as prevous fibonnacci number is not equal to 1 or 2.

        */

        if(n==2)
            return 1;

        if(n==1)
            return 0;

        else return findNthFibNumber(n-1) + findNthFibNumber(n-2);

    }
}