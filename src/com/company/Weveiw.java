package com.company;

public class Weveiw {

    void  sost( int a){
         int  result;
         result = 700-a;
        if ( result >0) System.out.println( " Ваш догл  по кредиту составляет: " + result + " грн");
        if ( result<0) System.out.println(" Ваш кредит погашен!!!\nПереплата  кредита составляет: " + result * (-1) + " грн");
        else if ( a == 700) System.out.println( "Ваш кредит погашен!!!");
    }

}
