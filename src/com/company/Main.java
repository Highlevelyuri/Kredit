package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Weveiw dew = new Weveiw();
        System.out.println( " Введите сумму для погашения кредита");
        int a = scanner.nextInt();

        dew.sost(a);

    }
}
