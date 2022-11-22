package com.company;    //package name of java com.company;


///////////////////////////////////////////////////////////////////////////
//Additional Information about Static modifier.
///////////////////////////////////////////////////////////////////////////
/*Note static class ,class name is Discount
The most important reason why static keywords are heavily used in Java is
to efficiently manage memory. Generally, if you want to access variables or
methods inside a class,
you first need to create an instance or object of that class.*/
///////////////////////////////////////////////////////////////////////////

//class name is Discount
        class Discount {
        //main program started
        public static void main(String[] args) {

            int  dis,amount,markedprice,a;  //int type variable is declared

            markedprice=100;    //variable marketplace is assign 100

            dis=25;  // 25 mean 25%

            System.out.println("markedprice :" + markedprice);    //print the marketprice integer value

            System.out.println("discount rate :"+dis);           //print the discount rate int variable

            a=100-dis;      //  actual cost price =  marketplace-discount price.

            amount= (a* markedprice)/100;    //formula of amount after discount

            //print the statement amount after discount.
            System.out.println("amount after discount :"+amount);

        }
    }

